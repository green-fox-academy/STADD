#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED
#include <stdio.h>
#include <string.h>

struct Pirate {
    char name[256];
    int has_wooden_leg;
    short int gold_count;
};

int goldSum(struct Pirate pirate[], int length);
double avgGold(struct Pirate pirate[], int length);
char* theLegend(struct Pirate pirate[], int length);

#endif // FUNCTION_H_INCLUDED
