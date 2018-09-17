#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED

#define PI 3.14

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

#endif // FUNCTION_H_INCLUDED
