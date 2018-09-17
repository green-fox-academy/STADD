#include "function.h"


int main()
{

    Sandwich sandwich;
    strcpy(sandwich.name, "name");
    sandwich.price = 3.99;
    sandwich.weight = 3.10;

    int amount = 2;

    printf("%.2f", orderPrice(sandwich, amount));

    return 0;
}
