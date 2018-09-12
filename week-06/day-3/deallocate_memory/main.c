#include <stdio.h>
#include <stdlib.h>

int main()
{
    int* pointer = NULL;
    int i;

    pointer = (int *)malloc(10*sizeof(int));
    for(i = 0; i < 10; i++)
    {
        pointer[i] = i;
        if(pointer[i] % 2 == 0)
        {
            printf("%d\n", pointer[i]);

        }
    }

    printf("***********************\n");

    pointer = (int *)realloc(pointer, 0);
    for(i = 0; i < 10; i++)
    {
        printf("%d\n", pointer[i]);
    }

    return 0;
}
