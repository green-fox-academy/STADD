#include <stdio.h>
#include <string.h>
#include "printer.h"
#include "rs232/rs232.h"

void print_startup_message()
{
	clear_screen();
	printf("Temperature Logger Application\n");
	printf("==============================\n");
	printf("Commands:\n");
	printf(" h      Show the command list\n");
	printf(" l      List available ports\n");
	printf(" p      Set port name\n");
	printf(" o      Open port\n");
	printf(" s      Start logging / Stop logging\n");
	printf(" c      Close port\n");
    printf(" e      Exit from the program\n");
    printf(" k      List after error handling\n");
    printf(" a      Avarage temperature handling by days\n");
}

void average_message(){
    clear_screen();

    FILE * file;
    file = fopen("log.txt", "r");

    printf("Choose from the numbers below\n");
    printf("-----------------------------\n");
    printf("1       Daily average\n");
    printf("2       Last days average\n");
    printf("3       Day to day average\n");
}

void clear_screen()
{
	system("cls");
}

void print_port_list()
{
	clear_screen();
	printf("Available serial ports:\n");
	printf("====================\n");
	int port_count = comEnumerate();
	if (port_count <= 0) {
		printf("No serial port found!\n");
	} else {
		for (int i = 0; i < port_count; i++)
			printf("%d. - %s\n", i + 1, comGetPortName(i));
	}
}
