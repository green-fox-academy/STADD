#include <stdio.h>
#include <stdlib.h>

int doubling(int* num);

int main()
{
    int num = 5;
    int* p_num = &num;

    printf("%d", doubling(p_num));

    return 0;
}

int doubling(int* num)
{
    int tmp = *num * 2;

    return tmp;
}
