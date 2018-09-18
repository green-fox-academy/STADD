#include "function.h"

double GetSurface(struct rectangular_cuboid cuboid)
{
    double surface = 2*(cuboid.a * cuboid.b + cuboid.b * cuboid.c + cuboid.c * cuboid.a);

    return surface;
}

double GetVolume(struct rectangular_cuboid cuboid)
{
    double volume = cuboid.a * cuboid.b * cuboid.c;

    return volume;
}

