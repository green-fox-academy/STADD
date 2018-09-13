#include <stdio.h>
#include <string.h>

// create a function which takes a char array as a parameter and
// returns the distance between the first and last occurance of character 's'

int main ()
{
    char str[] = "This is a sample string";
    char *first, *last;
    distance(str);

    return 0;
}

int distance(char* array)
{
    int first;
    int last;
    int i;
    int* num;

    for(i = 0; sizeof(array); i++) {
        if(array[i] == 's') {
            strcpy(num, array[i]);
            //printf("%d\n", i);
            printf("%d\n", num[i]);
        }
    }

    return last - first;
}
