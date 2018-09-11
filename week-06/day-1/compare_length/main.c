#include <stdio.h>
#include <stdlib.h>

int main()
{
    int p1[] = {1, 2, 3};
    int p2[] = {4, 5};

    if (sizeof(p2) > sizeof(p1))
    {
        printf("p2 has more elements than p1");
    }
    else
    {
        printf("p1 has more elements than p2");
    }

    return 0;
}
