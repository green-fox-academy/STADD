#include <stdio.h>
#include <stdlib.h>

// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"

int main()
{
    char array[5][5];
    char* p_array = &array;

    char* name_array[5] = {"lime", "forest green", "olive", "pale green", "spring green"};

    /*
    array[0][0] = "lime";
    array[0][1] = "forest green";
    array[0][2] = "olive";
    array[0][3] = "pale green";
    array[0][4] = "spring green";
    */

    int i;
    for(i = 0; i < 5; i++)
    {
        array[0][i] = name_array[i];
        printf("%s\n", *array);
    }
    return 0;
}
