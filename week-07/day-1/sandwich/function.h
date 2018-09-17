#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char name[50];
    float price;
    float weight;
} Sandwich;

float orderPrice(Sandwich sandwich, int amount);

#endif // FUNCTION_H_INCLUDED
