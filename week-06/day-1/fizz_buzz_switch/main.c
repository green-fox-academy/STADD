#include <stdio.h>
#include <stdlib.h>

// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.
// But this time use only switch case!

main()
{
    int a;

    for(a = 1; a <= 100; a++)
    {
        switch(a % 5)
        {
        case 0:
            printf("Buzz\n");
            break;
        case 3:
            printf("Fizz\n");
            break;
        case 5:
            printf("FizzBuzz\n");
            break;
        default :
            printf("%d\n", a);
        }
    }
}
