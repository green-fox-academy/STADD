#include "function.h"

int get_older_cars_than(struct Car* car, int length, int age)
{
    int count = 0;
    int i;
    for(i = 0; i < length; i++) {
        if(car[i].year < 2018-age) {
            count++;
        }
    }
    return count;
}

int get_transmission_count(struct Car* car, int length, enum transmission trans)
{
    int count = 0;
    int i;
    for(i = 0; i < length; i++) {
        if(car[i].trans == trans) {
            count++;
        }
    }
    return count;
}

