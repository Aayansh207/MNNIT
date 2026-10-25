#include <stdio.h>

void fun() {
    printf("Inside function 'fun'\n");
}
int main() {
    printf("%p\n",fun);
    return 0;
}

