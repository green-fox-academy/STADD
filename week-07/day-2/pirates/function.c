#include "function.h"

int sum = 0;

int goldSum(struct Pirate pirate[], int length)
{
    int i;
    int rnd = rand() % 1000;

    for(i = 0; i < length; i++) {
        pirate[i].gold_count = rnd;
        sum += pirate[i].gold_count;
    }

    return sum;
}

double avgGold(struct Pirate pirate[], int length)
{
    return sum / length;
}

char* theLegend(struct Pirate pirate[], int length)
{
    char* legend = "";
    //strcpy(legend, pirate[0].name);
    legend = pirate[0].name;
    int gold = pirate[0].gold_count;
    int i, j;
    int b = 0;

    for (i = 0; i < length; i++) {
        if (pirate[i].has_wooden_leg == 0 && pirate[i].gold_count > gold ) {
            gold = pirate[i].gold_count;
            b = i;
        }
    }
    legend = pirate[b].name;
    //strcpy(legend, pirate[b].name);

    return legend;
}
