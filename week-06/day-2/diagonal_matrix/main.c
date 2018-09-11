#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, j, size;

    printf("Enter the size of the matrix: \n");
    scanf("%d", &size);
    int matrix[size][size];


    for(i = 0; i < size; ++i)
    {
        for(j = 0; j < size; ++j)
        {
            matrix[i][j] = 0;
            matrix[i][i] = 1;
            printf("%d", matrix[i][j]);
        }
        printf("\n");
    }

    return 0;
}
