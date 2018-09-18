#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

typedef struct {
    float x;
    float y;
} Points;

Points create_point(float x, float y);

float distance(Points p1, Points p2);


#endif // FUNCTION_H_INCLUDED
