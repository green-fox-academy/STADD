#include <stdio.h>
#include <stdlib.h>

main()
{
    int a;
    int b;

    printf("Type in two numbers: ");
    scanf("%d", &a);
    scanf("%d", &b);

    if (a > b)
    {
        printf("%d", a);
    }
    else
    {
        printf("%d", b);
    }
}
