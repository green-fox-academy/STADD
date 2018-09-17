#include <stdio.h>
#include <stdlib.h>
#include "function.h"

// define a variable called PI with the value of 3.14
// create a function which takes the radius of a circle as a parameter
// and return the area of that cirle
// area = radius * radius * PI

float circleArea(float radius);

int main()
{
    float radius = 10;
    printf("%.2f", circleArea(radius));

	return 0;
}
