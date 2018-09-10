#include <stdio.h>
#include <stdlib.h>

main()
{
    int input;
    int a;

    printf("Type in a number: ");
    scanf("%d", &input);

    for(a = 1; a <= 10; a++)
    {
        printf("%d * %d = %d\n", a, input, a * input);
    }
}
