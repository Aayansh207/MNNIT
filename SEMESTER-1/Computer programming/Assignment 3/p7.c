#include <stdio.h>

int main() {
    int n;
    printf("1 : Addition\n");
    printf("2 : Subtraction\n");
    printf("3 : Product\n");
    printf("4 : Division\n");
    printf("Enter the number : ");
    scanf("%d", &n);

    switch (n) {
        case 1: {
            int a, b;
            printf("Enter the first value : ");
            scanf("%d", &a);
            printf("Enter the second value : ");
            scanf("%d", &b);
            printf("The addition is : %d\n", a + b);
            break;
        }
        case 2: {
            int c, d;
            printf("Enter the first value : ");
            scanf("%d", &c);
            printf("Enter the second value : ");
            scanf("%d", &d);
            printf("The subtraction is : %d\n", c - d);
            break;
        }
        case 3: {
            int e, f;
            printf("Enter the first value : ");
            scanf("%d", &e);
            printf("Enter the second value : ");
            scanf("%d", &f);
            printf("The product is : %d\n", e * f);
            break;
        }
        case 4: {
            int g, h;
            printf("Enter the first value : ");
            scanf("%d", &g);
            printf("Enter the second value : ");
            scanf("%d", &h);
            if (h == 0) {
                printf("Error: Division by zero not allowed!\n");
            } else {
                printf("The division is : %.2f\n", (float)g / h);
            }
            break;
        }
        default:
            printf("Invalid choice!\n");
    }

    return 0;
}
