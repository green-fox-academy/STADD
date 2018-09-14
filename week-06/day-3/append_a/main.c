#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
char* append(char* name);

int main()
{
    char animals[100];

    animals[0] = "koal";
    animals[1] = "pand";
    animals[2] = "zebr";

    char *teszt = strtok(animals, " ");
    printf("%s", teszt);

    return 0;
}
