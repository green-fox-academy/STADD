#include <stdio.h>
#include <string.h>

// Write a program that opens a file called "my-file.txt", then prints
// each of lines form the file.
// You have to create the file, you can use C-programming but it is not mandatory

int main ()
{
    int c;
    FILE *file;
    file = fopen("my-file.txt", "r");

    char printLine[100];
    while(!feof(file)) {
        fgets(printLine, 100, file);
        puts(printLine);
    }
    fclose(file);

    return 0;
}
