#include <stdio.h>
#include <stdlib.h>

// with malloc
// please allocate a 10 long array and fill it with 5!! numbers from 0 to 4, then print the whole array
// please delete the array before the program exits


int main()
{
    int* pointer = NULL;
    int i;

    pointer = (int *)malloc(10*sizeof(int));
    for(i = 0; i < 5; i++)
    {
        pointer[i] = i;
        printf("%d\n", pointer[i]);
    }

    printf("\n\n");

    free(pointer);

    for(i = 0; i < 5; i++)
    {
        printf("%d\n", pointer[i]);
    }

    return 0;
}
