#include <stdio.h>
#include <stdlib.h>

main()
{
    int dist_in_km;

    printf("Type in the distance in km: ");
    scanf("%d", &dist_in_km);
    printf("%f", dist_in_km * 0.62137119);
}
