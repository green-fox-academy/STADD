#include <stdio.h>

int main()
{
    struct Coordinates {
        int x;
        int y;
    };

    struct Coordinates cord[10];

    for(int i = 0; i < 10; i++) {
        int r = rand() % 100;
        int l = rand() % 100;
        cord[i].x = r;
        cord[i].y = l;
        printf("Coordinate %d\tX: %d\tY: %d\n",i, cord[i].x, cord[i].y);
    }

    return 0;
}
