#include "function.h"

int main()
{

    struct Pokemon pokemon[3];

    char* name0 = "Charmander";
    strcpy(pokemon[0].name, name0);

    pokemon[0].speed = 8.2;
    pokemon[1].speed = 5.1;
    pokemon[2].speed = 0.3;

    pokemon[0].strength = 10.1;
    pokemon[1].strength = 0.3;
    pokemon[2].strength = 1.4;

    pokemon[0].type = WATER;
    pokemon[1].type = FIRE;
    pokemon[2].type =  FIRE;

    printf("Faster Pokemons than given value: %d\n", get_faster(pokemon, 3, 1.5));
    printf("Pokemons with given type: %d\n", type_count(pokemon, 3, FIRE));
    printf("Strongest Pokemon's type: %s\n", get_strongest(pokemon, 3));
    printf("Max strength by type: %.2f\n", get_max_strength(pokemon, 3, FIRE));

    return 0;
}
