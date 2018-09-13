#include <stdio.h>
#include <string.h>

int main ()
{
    int c;
    FILE *file;
    file = fopen("my-file.txt", "w");

    fprintf(file, "Balázs Horváth\n");

    fclose(file);

    return 0;
}
