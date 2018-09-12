#include <stdio.h>
#include <stdlib.h>

int main()
{
    int numList[] = {3, 4, 5, 6, 7};
    double_items(numList);
    printf("%d\n", numList[1]);

    return 0;
}

void double_items(int list[])
{
    int i;
    for(i = 0; i < 5; i++)
    {
        list[i] *= 2;
    }

    return;
}
