#include <stdio.h>
#include <stdlib.h>

// please allocate a 10 long array and fill it with even numbers
// please allocate a 10 long array and fill it with odd numbers
// select an array, and push the elements into the another array
// print it the array in descending order
// delete the arrays after you don't use them

int main()
{
    int* pointer = NULL;
    int* p_odd = NULL;
    int i;

    pointer = (int*)calloc(10,sizeof(int));
    p_odd = (int*)calloc(10,sizeof(int));

    for(i = 0; i < 10; i++)
    {
        if(i % 2 == 0)
        {
            pointer[i] = i;
        }

        printf("%d\n", pointer[i]);
    }
    printf("************************\n");

    for(i = 0; i < 10; i++)
    {
        if(i % 2 != 0)
        {
            p_odd[i] = i;
        }

        printf("%d\n", p_odd[i]);
    }

    printf("************************\n");

    for(i = 0; i < 10; i++)
    {
        if(p_odd[i] % 2 != 0)
        {
            pointer[i] = p_odd[i];
        }

        printf("%d\n", pointer[i]);
    }

    free(pointer);
    free(p_odd);

    return 0;
}
