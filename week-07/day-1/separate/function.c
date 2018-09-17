#include <stdio.h>
#include <stdlib.h>
#include "function.h"

float circleArea(float radius)
{
    float area = radius * radius * PI;

    return area;
}

float circumference(float radius)
{
    float circumference = 2 * radius * PI;

    return circumference;
}
