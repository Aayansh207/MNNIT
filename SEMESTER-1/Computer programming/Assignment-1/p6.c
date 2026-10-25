#include <stdio.h>
#include <stdlib.h>

int main() {
    int a, b, ma, mi;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    ma = (a+b+abs(a-b))/2;
    mi = (a+b-abs(a-b))/2;
    printf("Maximum=%d\n",ma);
    printf("Minimum=%d\n",mi);
    return 0;
}

