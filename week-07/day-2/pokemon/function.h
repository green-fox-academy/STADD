#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED
#include <stdio.h>
#include <string.h>
#define MAX 10.0
#define MIN 0.0


enum pokemon_type {NORMAL, FIRE, WATER, ELECTRIC, GRASS, ICE, FIGHTING, POISION, GROUND, FLYING, PSYCHIC, BUG, ROCK, GHOST, DRAGON, DARK, STEEL, FAIRY};

struct Pokemon {
    char name[30];
    int age;
    float strength;
    float speed;
    enum pokemon_type type;

};

int get_faster(struct Pokemon* pokemon, int length, float speed);
int type_count(struct Pokemon* pokemon, int length, enum pokemon_type type);
char* get_strongest(struct Pokemon* pokemon, int length);
float get_max_strength(struct Pokemon* pokemon, int length, enum pokemon_type type);

#endif // FUNCTION_H_INCLUDED
