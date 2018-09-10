#include <stdio.h>
#include <stdlib.h>

main()
{
    int input;

    printf("Type in a number: ");
    scanf("%d", &input);

    if (input <= 0)
    {
        printf("Not enough");
    }
    else if (input == 1)
    {
        printf("One");
    }
    else if (input == 2)
    {
        printf("Two");
    }
    else
    {
        printf("A lot");
    }
}
