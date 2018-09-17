#include <stdio.h>
#include <stdint.h>
#include <string.h>

// Use the Computer struct, give values to the fields and print them out in the main!
// Use the Notebook struct, give values to the fields and print them out in the main!

struct Computer {
    float cpu_speed_GHz;
    int ram_size_GB;
    int bits;
};

typedef struct {
    float cpu_speed_GHz;
    int ram_size_GB;
    int bits;
} Notebook;

int main()
{
    Notebook notebook;

    notebook.cpu_speed_GHz = 2.8;
    notebook.ram_size_GB = 8;
    notebook.bits = 64;

    printf("The notebook has a %.1f Ghz CPU, %d GB of ram and it is %d bits\n", notebook.cpu_speed_GHz, notebook.ram_size_GB, notebook.bits);

    struct Computer computer;

    computer.cpu_speed_GHz = 3.8;
    computer.ram_size_GB = 16;
    computer.bits = 64;

    printf("The computer has a %.1f Ghz CPU, %d GB of ram and it is %d bits", computer.cpu_speed_GHz, computer.ram_size_GB, computer.bits);

    return 0;
}
