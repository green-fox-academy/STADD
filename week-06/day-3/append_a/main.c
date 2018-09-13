#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
char* append(char* name);

int main()
{
    char animals[3];
    animals[0] = "koal";
    animals[1] = "pand";
    animals[2] = "zebr";
    printf("%s\n", animals[0]);
    char * p_animals = &animals;
    //printf("%s\n", append(p_animals));
    return 0;
}

char* append(char* name)
{
    int i;
    for(i = 0; i < 3; i++) {
        size_t len = strlen(name);
        char *name2 = malloc(len + 2);
        strcpy(name2, name);
        name2[len] = 'a';
        name2[len + 1] = '\0';
        return name2;
    }
}
