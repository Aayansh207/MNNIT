#include<stdio.h>

int main(){
  int row;
  int col;
  printf("Enter the dimensions of the matrices : ");
  scanf("%d %d",&row,&col);
  int A[row][col];
  int B[row][col];
  printf("Enter the first matrix : \n");
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      scanf("%d",&A[i][j]);
    }
  }
  printf("Enter the second matrix : \n");
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      scanf("%d",&B[i][j]);
    }
  }
  printf("Addition matrix : \n");
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      printf("%d ",A[i][j]+B[i][j]);
    }
    printf("\n");
  }
  printf("Subtraction matrix : \n");
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
      printf("%d ",A[i][j]-B[i][j]);
    }
    printf("\n");
  }
  return 0;
}

