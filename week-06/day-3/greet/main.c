#include <stdio.h>
#include <stdlib.h>

void greet_function(char* name);

int main()
{
    int a1 = "Greenfox";
    greet_function(a1);

    return 0;
}

void greet_function(char* name)
{
    printf("Greetings dear, %s", name);

    return;
}
