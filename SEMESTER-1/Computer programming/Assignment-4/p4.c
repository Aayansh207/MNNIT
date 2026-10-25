#include <stdio.h>

int main() {
    int num;
    printf("Enter numbers (enter -1 to stop):\n");
    while(1){
        scanf("%d",&num);
        if(num==-1){
            printf("Loop terminated.\n");
            break;
        }
        printf("You entered: %d\n",num);
    }
    return 0;
}
