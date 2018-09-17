#include <stdio.h>
#include <stdlib.h>

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc` by using a function
// - That function should take an array as a parameter and return the correct array
char* swapElement(char* array);

int main()
{
    char abc = {"first", "second", "third"};
    char* p_abc = abc;

    printf("%s", swapElement(p_abc));

    return 0;
}

char* swapElement(char* array)
{
    char* temp;

    temp = array[0];

    array[0] = array[2];
    arry[2] = temp;
}
