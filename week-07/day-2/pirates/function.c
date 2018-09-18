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
    char* legend = pirate[0].name;
    int gold = pirate[0].gold_count;
    int i, j;

    for (i = 0; i < length; i++) {
        if (pirate[i].has_wooden_leg == 0 && pirate[i].gold_count > gold ) {
            gold = pirate[i].gold_count;
        }
    }

    for(j = 0; j < length; j++) {
        if (gold == pirate[i].gold_count) {
            strcpy(legend, pirate[j].name);
        }
    }
    return legend;
}
