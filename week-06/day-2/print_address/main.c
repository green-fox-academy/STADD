#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number = 1234;

    int* address = &number;
    printf("%d", address);

    return 0;
}
