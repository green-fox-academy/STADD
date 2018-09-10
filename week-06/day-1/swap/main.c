#include <stdio.h>
#include <stdlib.h>

main()
{
  // Swap the values of the variables
  int a = 123;
  int b = 526;

  a = a + b;
  b = a - b;
  a = a - b;

  printf("%d\n", a);
  printf("%d", b);
}
