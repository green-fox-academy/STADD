#include <stdio.h>
#include <stdlib.h>

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc` by using a function
// - That function should take an array as a parameter and return the correct array

int main()
{
    char* abc[3] = {"first", "second", "third"};

    printf("%s %s %s\n", abc[0], abc[1], abc[2]);



    printf("%s %s %s\n", abc[0], abc[1], abc[2]);


    return 0;
}

char* swapElement(char* array)
{
    char* temp;

    temp = abc[0];

    abc[0] = abc[2];
    abc[2] = temp;
}
