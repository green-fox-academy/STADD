#include "function.h"
/*
Create a function that takes an array of pirates (and it's length) then returns the name of the
richest that has wooden leg
*/

int main()
{

    struct Pirate pirate[2];

    pirate[0].gold_count = 100;
    pirate[1].gold_count = 23;

    *pirate[0].name = "Jack";
    *pirate[1].name = "black";

    printf("The pirates has %d gold\n", goldSum(pirate, 2));
    printf("One pirate has an average of %.1f gold\n", avgGold(pirate, 2));
    printf("%s", theLegend(pirate, 2));

    return 0;
}
