#include<stdio.h>

main()
{
  int hours_daily = 6;
  int weeks = 17;
  double average_weekly = 52;
  double hours_weekly = hours_daily * 5;

  printf("%d\n", hours_daily * weeks * 5);
  printf("%.2f", hours_weekly / average_weekly);
  printf(weeks);
}
