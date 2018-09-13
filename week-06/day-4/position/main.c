#include <stdio.h>
#include <string.h>

// create a function which takes a char array as a parameter and
// lists all position where character 'i' is found
void listPos(char* array);

int main ()
{
    char string[55] = "This is a string for testing";
    char* p_string = string;

    listPos(p_string);

    return 0;
}

void listPos(char* array)
{
    int sum = 0;
    int i;
    int* num_array = (int *)malloc(sizeof(array));


    for(i = 0; sizeof(array); i++) {
        if(array[i] == 'i') {
            printf("%d\n", i);
        }

    }

    return;
}
