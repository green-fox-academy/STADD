#include <stdio.h>
#include <stdlib.h>

main()
{
    int chickens;
    int pigs;

    printf("Enter the number of chickens: ");
    scanf("%d", &chickens);

    printf("Enter the number of pigs: ");
    scanf("%d", &pigs);

    printf("%d", chickens * 2 + pigs * 4);
}
