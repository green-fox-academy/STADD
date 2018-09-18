#include "function.h"

int main()
{
    House house;
    house.price = 11000;
    house.area = 30;

    House houses[10];

    worthBuying(house);

    houses[0].price = 10;
    houses[0].area = 100;

    printf("%d", countWorthy(houses, 10));

    return 0;
}
