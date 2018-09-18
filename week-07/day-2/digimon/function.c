#include "function.h"

int getMinHealth(struct Digimon* digimon, int length)
{
    int i;
    int index = 0;
    int minHealth = digimon[0].health;

    for(i = 0; i < length; i++) {
        if(digimon[i].health < minHealth) {
            index = i;
        }
    }
    return index;
}

int digivolutionCount(struct Digimon* digimon, int length, enum digivolution digiv)
{
    int i;
    int count = 0;

    for(i = 0; i < length; i++){
        if(digimon[i].digiv == digiv){
            count++;
        }
    }
    return count;
}

int sameTamer(struct Digimon* digimon, int length, char *tamer)
{
    int i;
    int count = 0;

    for(i = 0; i < length; i++){
        if(digimon[i].tamer == *tamer){
            count++;
        }
    }
    return count;
}
