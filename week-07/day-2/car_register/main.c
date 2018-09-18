#include "function.h"

int main()
{
    struct Car car[3];

    car[0].year = 1999;
    car[0].trans = MANUAL;
    car[1].year = 2012;
    car[1].trans = SEMI_AUTOMATIC;
    car[2].year = 2017;
    car[2].trans = MANUAL;

    printf("Older cars: %d\n", get_older_cars_than(car, 3, 5));
    printf("Cars with given transmission: %d", get_transmission_count(car, 3, MANUAL));

    return 0;
}
