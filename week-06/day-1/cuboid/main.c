#include <stdio.h>
#include <stdlib.h>
#include <math.h>

main()
{
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000

    double a = 10;
    double volume = pow(a, 3);
    double surface = pow(a, 2);

    printf("Surface Area: %.0f\n", surface * 6);
    printf("Volume: %.0f\n", volume);

}
