#include <stdio.h>
#include <stdlib.h>

main()
{
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables

    int one_hour = 3600;
    int one_minute = 60;
    int one_day = 84600;

    printf("%d", one_day - (currentHours * one_hour + currentMinutes * one_minute + currentSeconds));
}
