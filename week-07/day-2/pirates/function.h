#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED
#include <stdio.h>

struct Pirate {
    char name[256];
    int has_wooden_leg;
    short int gold_count;
};

int goldSum(struct Pirate pirate[]);
double avgGold(struct Pirate pirate[]);
char theChosenOne(struct Pirate pirate[]);

#endif // FUNCTION_H_INCLUDED
