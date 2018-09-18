#include "function.h"

int get_faster(struct Pokemon *pokemon, int length, float speed)
{
    int count = 0;
    int i;

    for(i = 0; i < length; i++) {
        if(pokemon[i].speed < 0.0 || pokemon[i].speed > 10.0) {
            count = 0;
        } else {
            if(pokemon[i].speed >= speed) {
                count++;
            }
        }
    }
    return count;
}

int type_count(struct Pokemon* pokemon, int length, enum pokemon_type type)
{
    int count = 0;
    int i;

    for(i = 0; i < length; i++) {
        if(pokemon[i].type == type) {
            count++;
        }
    }
    return count;
}

char* get_strongest(struct Pokemon* pokemon, int length)
{
    int i;
    int p_num = 0;
    char* type;
    float strongest = pokemon[0].strength;

    for(i = 0; i < length; i++) {
        if(pokemon[i].strength > strongest) {
            strongest = pokemon[i].strength;
            p_num = i;
        }
    }

    switch(pokemon[p_num].type) {
    case 0 :
        type = "NORMAL";
        break;
    case 1 :
        type = "FIRE";
        break;
    case 2 :
        type = "WATER";
        break;
    case 3 :
        type = "ELECTRIC";
        break;
    case 4 :
        type = "GRASS";
        break;
    case 5 :
        type = "ICE";
        break;
    case 6 :
        type = "FIGHTING";
        break;
    case 7 :
        type = "POISION";
        break;
    case 8 :
        type = "GROUND";
        break;
    case 9 :
        type = "FLYING";
        break;
    case 10 :
        type = "PSYCHIC";
        break;
    case 11 :
        type = "BUG";
        break;
    case 12 :
        type = "ROCK";
        break;
    case 13 :
        type = "GHOST";
        break;
    case 14 :
        type = "DRAGON";
        break;
    case 15 :
        type = "DARK";
        break;
    case 16 :
        type = "STEEL";
        break;
    case 17 :
        type = "FAIRY";
        break;
    default :
        type = "NULL";
        break;
    }
    return type;
}

float get_max_strength(struct Pokemon* pokemon, int length, enum pokemon_type type)
{
    int i;
    float strength = pokemon[0].strength;

    for(i = 0; i < length; i++) {
        if(pokemon[i].strength > strength && pokemon[i].type == type) {
            strength = pokemon[i].strength;
        }
    }
    return strength;
}
