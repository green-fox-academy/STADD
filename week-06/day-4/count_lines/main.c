#include <stdio.h>
#include <string.h>

int numberOfLines(char* name);

int main ()
{
    char fileName[] = "text.txt";
    char* p_name = fileName;
    printf("Number of lines: %d", numberOfLines(p_name));
    return 0;
}

int numberOfLines(char* name)
{
    FILE * file;
    file = fopen(name, "r");
    int lines = 0;
    char printLine;

    while((printLine = fgetc(file)) !=  EOF) {
        if(printLine == '\n') {
            lines++;
        }
    }

    lines++;

    fclose(file);

    return lines;

}
