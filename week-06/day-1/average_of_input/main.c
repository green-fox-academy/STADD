#include <stdio.h>
#include <stdlib.h>

main()
{
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

    int a;
    int b;
    int c;
    int d;
    int e;

    printf("Type in 5 numbers in a row: ");
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    scanf("%d", &d);
    scanf("%d", &e);
    int sum = a + b + c + d + e;
    printf("Sum: %d, Average: %d", sum, sum / 5);
}
