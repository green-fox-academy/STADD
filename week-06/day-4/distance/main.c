#include <stdio.h>
#include <string.h>

// create a function which takes a char array as a parameter and
// returns the distance between the first and last occurance of character 's'

int distance(char* array);

int main ()
{
    char str[] = "This is a sample string";
    //char *first, *last;
    printf("%d", distance(str));

    return 0;
}

int distance(char* array)
{
    int i;
    int first = 0;
    int last = 0;

    for(i = 0; i < strlen(array); i++) {
        if(array[i] == 's') {
            first = i;
            break;
        }
    }

    for(i = 0; i < strlen(array); i++) {
        if(array[i] == 's') {
            last = i;
        }
    }

    return last - first;
}
