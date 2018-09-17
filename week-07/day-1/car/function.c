#ifndef FUNCTION_C_INCLUDED
#define FUNCTION_C_INCLUDED
#include "function.h"

void printStat(struct car car)
{
    if (car.type != TESLA) {
        printf("Km: %.2f\nGas: %.2f\n", car.km, car.gas);

    } else {
        printf("Km: %.2f\n", car.km);
    }
}

#endif // FUNCTION_C_INCLUDED
