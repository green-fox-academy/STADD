#include <stdio.h>
#include <stdlib.h>

int factorial(int number);

int main()
{
    int input = 10;
    printf("%d", factorial(input));

    return 0;
}

int factorial(int number)
{
    int i;
    int fact = 1;

    for(i = 1; i <= number; i++)
    {
        fact *= i;
    }

    return fact;
}
