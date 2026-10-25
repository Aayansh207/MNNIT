#include <stdio.h>

int main() {
    int i,j,n;
    printf("Enter the order of the matrix: ");
    scanf("%d",&n);
    int a[n][n];
    printf("Enter the elements of the matrix:\n");
    for(i=0;i<n;i++){
      for(j=0;j<n;j++) scanf("%d",&a[i][j]);
    }
    printf("\nLower Triangular Matrix:\n");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i>=j) printf("%d ",a[i][j]);
            else printf("0 ");
        }
        printf("\n");
    }
    printf("\nUpper Triangular Matrix:\n");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i<=j) printf("%d ", a[i][j]);
            else printf("0 ");
        }
        printf("\n");
    }

    return 0;
}

