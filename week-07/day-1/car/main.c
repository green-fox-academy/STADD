#include "function.h"

int main()
{
    struct car car;
    car.gas = 30.5;
    car.km = 5000.23;
    car.type = TESLA;

    printStat(car);

    return 0;
}
