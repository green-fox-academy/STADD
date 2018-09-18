#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED
#include <stdio.h>

struct rectangular_cuboid {
    double a;
    double b;
    double c;
};

double GetSurface(struct rectangular_cuboid cuboid);

double GetVolume(struct rectangular_cuboid cuboid);
#endif // FUNCTION_H_INCLUDED
