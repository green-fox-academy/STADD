#include "function.h"

int sum = 0;

int goldSum(struct Pirate pirate[])
{
    int i;
    int rnd = rand() % 1000;

    for(i = 0; i < 10; i++) {
        pirate[i].gold_count = rnd;
        sum += pirate[i].gold_count;
    }

    return sum;
}

double avgGold(struct Pirate pirate[])
{
    return sum / 10;
}

char theChosenOne(struct Pirate pirate[])
{
    return 'C';
}
