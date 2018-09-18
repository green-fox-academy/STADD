#include "function.h"

int main()
{
    Points p1 = create_point(3, 2);
    Points p2 = create_point(9, 7);

    printf("X: %.1f\tY: %.1f\n", p1.x, p1.y);
    printf("X: %.1f\tY: %.1f\n", p2.x, p2.y);

    printf("Distance: %f", distance(p1, p2));

    return 0;
}
