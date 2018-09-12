#include <stdio.h>
#include <stdlib.h>

int sum_elements(int num);

int main()
{
    int coun_to = 5;
    printf("%d", sum_elements(coun_to));

    return 0;
}

int sum_elements(int num)
{
    int i;
    int sum = 0;
    for(i = 1; i <= num; i++)
    {
        sum += i;
    }

    return sum;
}
