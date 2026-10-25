#include <stdio.h>

int main() {
    int n;
    printf("Enter value of n: ");
    scanf("%d",&n);
    int mat[10][10];
    printf("Enter matrix:\n");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++) scanf("%d",&mat[i][j]);
    }
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            int temp=mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
        }
    }
    for (int j=0;j<n;j++){
        for (int i=0;i<n/2;i++){
            int k=n-i-1;
            int temp=mat[i][j];
            mat[i][j]=mat[k][j];
            mat[k][j]=temp;
        }
    }
    printf("Answer:\n");
    for (int i=0;i<n;i++){
        for (int j=0;j<n;j++)
            printf("%d ",mat[i][j]);
        printf("\n");
    }
    return 0;
}

