#include "function.h"

int main()
{
    struct rectangular_cuboid cuboid;
    cuboid.a = 10;
    cuboid.b = 4;
    cuboid.c = 5;

    printf("%.1f\n", GetSurface(cuboid));

    printf("%.1f", GetVolume(cuboid));

    return 0;
}
