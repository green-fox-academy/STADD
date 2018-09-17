#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED
#include <stdio.h>

enum car_type {VOLVO, TOYOTA, LAND_ROVER, TESLA};

struct car {
    enum car_type type;
    double km;
    double gas;
};

void printStat(struct car car);

#endif // FUNCTION_H_INCLUDED
