#include <stdio.h>
#include <string.h>

int main()
{
    char* path = "my-text.txt";
    char* word = "apple\n";
    int number = 5;

    printLines(path, word, number);

    return 0;
}

void printLines(char* path, char* word, int number)
{
    FILE * file = fopen(path, "w");
    int i;
    for(i = 0; i < number; i++) {
        fprintf(file, word);
    }
    fclose(file);

    return;
}
