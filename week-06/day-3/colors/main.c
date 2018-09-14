#include <stdio.h>
#include <stdlib.h>

int main()
{
    char *array[10][10] = {
        {"lime", "forest green", "olive", "pale green", "pale green", "spring green"},
        {"orange red", "red", "tomato"},
        {"orchid", "violet", "pink", "hot pink"}
    };

    printf("%s", array[2][1]);
    return 0;
}
