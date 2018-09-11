#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int number = 2017;
    float Pi = 3.14;
    char letter = 't';

    int* p_number = &number;
    float* p_Pi = &Pi;
    char* p_letter = &letter;

    printf("Address with pointer:    number: %p, Pi: %p, letter: %p\n", p_number, p_Pi, p_letter);
    printf("Address without pointer: number: %p, Pi: %p, letter: %p\n\n", &number, &Pi, &letter);

    printf("Value with pointer:    number: %d, Pi: %.2f, letter: %c\n", *p_number, *p_Pi, *p_letter);
    printf("Value without pointer: number: %d, Pi: %.2f, letter: %c\n", number, Pi, letter);

    return 0;
}
