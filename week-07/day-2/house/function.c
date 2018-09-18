#include "function.h"

void worthBuying(House house)
{
    if (house.price <= house.area * 400) {
        printf("It's worth to buy the house\n");
    } else {
        printf("It's not worth to buy the house\n");
    }
}

int countWorthy(House houses[])
{
    int count = 0;
    int i;

    for(i = 0; i < 10 ; i++) {
        if (houses[i].price <= houses[i].area * 400) {
            count++;
        }
    }

    return count;
}
