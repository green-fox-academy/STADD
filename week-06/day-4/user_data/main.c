#include <stdio.h>
#include <string.h>

int main ()
{
    char data[40];

    printf("Type your full name and age: \n");
    gets(data);

    char *first_name = strtok(data, " ");
    char *last_name = strtok(NULL, " ");
    char *age = strtok(NULL, " ");

    printf("Your name is: %s %s and you are %d years old", first_name, last_name, atoi(age));

    return 0;
}
