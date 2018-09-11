#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a = 20;
    int b = 17;
    int sum = a + b;

    int* p_sum = &sum;
    printf("%d", *p_sum);

    return 0;
}
