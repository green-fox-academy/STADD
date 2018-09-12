#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* append(char* name);

int main()
{
    char typo[] = "Chinchill";
    char* p_t = &typo;

    printf("%s", append(p_t));

    return 0;
}

char* append(char* name)
{
    size_t len = strlen(name);
    char *name2 = malloc(len + 2);
    strcpy(name2, name);
    name2[len] = 'a';
    name2[len + 1] = '\0';
    return name2;

}
