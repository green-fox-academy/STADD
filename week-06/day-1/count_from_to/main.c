#include <stdio.h>
#include <stdlib.h>

main()
{
    int input1;
    int input2;

    printf("Type in two numbers: \n");
    scanf("%d", &input1);
    scanf("%d", &input2);

    if (input1 < input2)
    {
        for(input1; input1 < input2; input1++)
        {
            printf("%d\n", input1);
        }
    }
}
