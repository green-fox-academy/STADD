#include <stdio.h>
#include <stdlib.h>

main()
{
    int input;

    printf("Type in a number: ");
    scanf("%d", &input);

    if (input % 2 == 0)
    {
        printf("Even");
    }
    else
    {
        printf("Odd");
    }
}
