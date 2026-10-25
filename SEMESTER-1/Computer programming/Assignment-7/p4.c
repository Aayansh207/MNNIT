#include <stdio.h>

int main() {
    int r1,c1,r2,c2;
    printf("Enter Dimension of first matrix: ");
    scanf("%d %d",&r1,&c1);
    printf("Enter Dimension of second matrix: ");
    scanf("%d %d",&r2,&c2);
    int a[r1][c1],b[r2][c2],r[r1][c2];
    if(c1!=r2){
        printf("Invalid input");
        return 0;
    }
    printf("Enter First matrix:\n");
    for(int i=0;i<r1;i++)
        for(int j=0;j<c1;j++) scanf("%d",&a[i][j]);
    printf("Enter Second matrix:\n");
    for(int i=0;i<r2;i++)
        for(int j=0;j<c2;j++) scanf("%d",&b[i][j]);
        
    for (int i=0;i<r1;i++)
        for (int j=0;j<c2;j++) r[i][j]=0;
        
    for (int i=0;i<r1;i++)
        for (int j=0;j<c2;j++)
            for (int k=0;k<c1;k++) r[i][j]+=a[i][k]*b[k][j];
            
    printf("Final Matrix:\n");
    for (int i=0;i<r1;i++){
        for(int j=0;j<c2;j++) printf("%d ",r[i][j]);
        printf("\n");
    }
    return 0;
}

