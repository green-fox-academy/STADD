#include "function.h"
/*
Create a function that takes an array of pirates (and it's length) then returns the name of the
richest that has wooden leg
*/

int main()
{
    struct Pirate pirate[10];

    pirate[0].gold_count = 100;
    pirate[1].gold_count = 23;

    printf("The pirates has %d gold\n", goldSum(pirate));
    printf("One pirate has an average of %.1f gold\n", avgGold(pirate));
    printf("%s", theChosenOne(pirate));

    return 0;
}
