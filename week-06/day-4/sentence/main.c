#include <stdio.h>
#include <string.h>

int main()
{
    char string[256];

    printf("Type in a sentence:\n\n");
    gets(string);

    splitString(string);

    return(0);
}

void splitString(char* array)
{
    char* split;
    split = strtok(array, " ");

    while (split != NULL) {
        printf ("%s\n", split);
        split = strtok (NULL, " ");
    }

    return;
}
