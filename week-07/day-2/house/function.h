#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED
#include <stdio.h>

typedef struct {
    char address[10];
    double price;
    int rooms;
    double area;
} House;

void worthBuying(House house);

int countWorthy(House house[], int length);
#endif // FUNCTION_H_INCLUDED
