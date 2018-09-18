#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED
#include <string.h>
#include <stdio.h>

enum transmission {MANUAL, AUTOMATIC, CVT, SEMI_AUTOMATIC, DUAL_CLUTCH};

struct Car {
    char name[20];
    float price;
    int year;
    enum transmission trans;
};

int get_older_cars_than(struct Car* car, int length, int age);
int get_transmission_count(struct Car* car, int length, enum transmission trans);

#endif // FUNCTION_H_INCLUDED
