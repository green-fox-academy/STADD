#include <stdio.h>
#include <math.h>
#include <errno.h>
#include <fenv.h>

main()
{
    double massInKg = 81.2;
    double heightInM = 1.78;

    printf("%.2f", massInKg / pow(heightInM, 2));
}
