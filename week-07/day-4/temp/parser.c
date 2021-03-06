#include <stdio.h>
#include <time.h>
#include "rs232/rs232.h"
#include "parser.h"
#include "printer.h"
#include "string.h"

int parser_port = -1;


int get_port_name()
{
    clear_screen();
    printf("Please enter the name of the serial port you want to use!\n");
    char port_name[PORT_NAME_MAX_LEN];
    fgets(port_name, PORT_NAME_MAX_LEN - 1, stdin);

    // Remove \r and \n characters
    for (int i = 0; i < PORT_NAME_MAX_LEN; i++) {
        if (port_name[i] == '\r' || port_name[i] == '\n')
            port_name[i] = '\0';
    }

    // Find the index of that port
    parser_port = comFindPort(port_name);

    if (parser_port < 0) {
        printf("%s not exists!\n", port_name);
        return -1;
    } else {
        printf("%s port exists, saved.\n", port_name);
    }

    return 0;
}

int open_port()
{
    clear_screen();
    if (parser_port < 0) {
        printf("Port not set!\n");
        return -1;
    }

    comClose(parser_port);
    if(!comOpen(parser_port, BAUD_RATE)) {
        printf("Port can not be opened. Try to set the port again!\n");
        return -1;
    } else {
        printf("Port opened successfully!\n");
        return 0;
    }
}

int close_port()
{
    clear_screen();
    if (parser_port < 0) {
        printf("Port not set!\n");
        return -1;
    }

    comClose(parser_port);
    printf("Port closed.\n");
    return 0;
}


int get_line_from_port(char *buff, int buff_len)
{
    if (parser_port < 0) {
        printf("Port not set!\n");
        return -1;
    }

    // Put data into the
    char ch;
    int i = 0;
    int bytes = comRead(parser_port, &ch, 1);
    // If there is no data on the port, exit
    if (bytes <= 0) {
        return 0;
    }
    // This loop will read until a \n character. If the buffer is too small, then
    // the characters will be discarded after the size limit is reached.
    while (ch != '\n') {
        // Check if there is enough space in the buffer
        if (i < (buff_len - 1)) {
            // Check if we are not near the end of the line (cr character)
            if (ch != '\r') {
                buff[i] = ch;
                i++;
            }
        }
        while (comRead(parser_port, &ch, 1) == 0);
    }
    // Put terminating zero at the end
    buff[i] = '\0';

    return i;
}

int log_data()
{
    // Check if port set up properly
    if (parser_port < 0) {
        printf("Port not set!\n");
        return -1;
    }

    FILE * file;
    file= fopen("log.txt", "a");

    // Get a line of data from the port
    // If there is no data on the port, then do nothing
    char buff[PORT_BUFFER_LEN];
    if (get_line_from_port(buff, PORT_BUFFER_LEN) > 0) {
        // Put the data into the logfile
        //Printing thebuffer
        fprintf(file, "%s\n", buff);
        printf("%s\n",buff);
    }

    fclose(file);

    return 0;
}

void after_error()
{
    FILE * file;
    file= fopen("log.txt", "r");
    char printLine[100];
    char* date;
    char* time;
    char* temperature;

    char* year;
    char* month;
    char* day;

    char* hour;
    char* min;
    char* sec;

    clear_screen();
    printf("          Log file\n");
    printf("==============================\n\n");

    while(fgets(printLine, 100, file) != NULL) {
        date = strtok(printLine, " ");
        time = strtok(NULL, " ");
        temperature = strtok(NULL, " ");

        //Date tokens
        year = strtok(date, ".");
        month = strtok(NULL, ".");
        day = strtok(NULL, ".");

        //Time tokens
        hour = strtok(time, ":");
        min = strtok(NULL, ":");
        sec = strtok(NULL, ":");

        int stringCount = 0;



        //Check temperature
        for (int i = 0; i < strlen(temperature) - 1; i++) {
            if(isdigit(temperature[i]) == 0) {
                stringCount++;
            }
        }

        //Test code for date filter
        if(strlen(year) <= 4 && atoi(year) <= 2018) {
            if(strlen(month) <= 2 && month[0] != '-' && atoi(month) <= 12) {
                if(strlen(day) <= 2 && day[0] != '-' && atoi(day) <= 31 && atoi(day) != 0) {
                    if((stringCount == 0) || (temperature[0] == '-')) {
                        if(hour[0] != '-' && atoi(hour) <= 23 && atoi(hour) != 0) {
                            if(min[0] != '-' && atoi(min) <= 59 && atoi(min) != 0) {
                                if(sec[0] != '-' && atoi(sec) <= 59 && atoi(sec) != 0) {
                                    printf("%s.%s.%s\t%s:%s:%s\t%s", year, month, day, hour, min, sec, temperature);
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    fclose(file);
}

void averageByDay()
{
    clear_screen();

    FILE * file;
    file= fopen("log.txt", "r");


}
