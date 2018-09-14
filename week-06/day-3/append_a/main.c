#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char *animals[3][4] = {{"koal"}, {"pand"}, {"zebr"}};

    char* firstElement = animals[0][0];
    char* secondElement = animals[1][0];
    char* thirdElement = animals[2][0];

    firstElement[4] = 'a';
    firstElement[5] = '\0';

    printf("%s  %s  %s", firstElement, secondElement, thirdElement);

    return 0;
}
