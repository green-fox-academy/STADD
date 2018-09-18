#ifndef FUNCTION_H_INCLUDED
#define FUNCTION_H_INCLUDED
#include <stdio.h>
#include <string.h>

enum digivolution {BABY, IN_TRAINING, ROOKIE, CHAMPION, ULTIMATE, MEGA};

struct Digimon {
    char name[15];
    int age;
    int health;
    char tamer[20];
    enum digivolution digiv;
};

int getMinHealth(struct Digimon* digimon, int length);
int digivolutionCount(struct Digimon* digimon, int length, enum digivolution digiv);
int sameTamer(struct Digimon* digimon, int length, char *tamer);
#endif // FUNCTION_H_INCLUDED
