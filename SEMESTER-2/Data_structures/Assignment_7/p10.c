#include <stdio.h>
void hanoi(int n, char A, char B, char C){
    if(n==1){
        printf("Move %c -> %c\n", A, C);
        return;
    }
    hanoi(n-1, A, C, B);
    printf("Move %c -> %c\n", A, C);
    hanoi(n-1, B, A, C);
}
int main(){
    int n=3;
    hanoi(n,'A','B','C');
}
