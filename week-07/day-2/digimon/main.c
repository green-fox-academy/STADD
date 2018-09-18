#include "function.h"
/*
 * 3) Get same tamer count
 *      - parameters:
 *          - array
 *          - array length
 *          - tamer name
 *      - it returns the count of the digimons which have the same tamer as "tamer name"
 * 4) Get average health of the same tamer
 *      - parameters:
 *          - array
 *          - array length
 *          - tamer name
 *      - it returns the average health of the digimons which have the same tamer as "tamer name"
 *
 * Don't forget to handle invalid inputs (NULL pointers, invalid values etc.)
 */

int main()
{
    int length = 3;
    struct Digimon digimon[2];

    digimon[0].health = 70;
    digimon[1].health = 20;
    digimon[2].health = 100;

    digimon[0].digiv = CHAMPION;
    digimon[1].digiv = BABY;
    digimon[2].digiv = CHAMPION;

    char* name0 = "Bela";
    char* name1 = "Balazs";

    strcpy(digimon[0].tamer, name0);
    strcpy(digimon[1].tamer, name0);
    strcpy(digimon[2].tamer, name1);


    printf("The index of the lowest health digimon: %d\n", getMinHealth(digimon, length));
    printf("Digimons with the same given evolution level: %d\n", digivolutionCount(digimon, length, CHAMPION));
    printf("Digimons with the same tamer: %d\n", sameTamer(digimon, length, name0));
}
