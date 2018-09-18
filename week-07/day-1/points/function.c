#include "function.h"
#include <math.h>

Points create_point(float x, float y)
{
    Points p;
    p.x = x;
    p.y = y;

    return p;
}

float distance(Points p1, Points p2)
{
    float a = powf((p2.x - p1.x), 2);
    float b = powf((p2.y - p1.y), 2);

    return sqrtf(a + b);
}
