#include<stdio.h>

int main(){
  int row1,row2;
  int col1,col2;
  printf("Enter the dimensions of the first matrix : ");
  scanf("%d %d",&row1,&col1);
  printf("Enter the dimensions of the second matrix : ");
  scanf("%d %d",&row2,&col2);
  if(col1!=row2){printf("Multiplication not possible\n");return 0;}
  int A[row1][col1];
  int B[row2][col2];
  printf("Enter the first matrix : \n");
  for(int i=0;i<row1;i++){
    for(int j=0;j<col1;j++){
      scanf("%d",&A[i][j]);
    }
  }
  printf("Enter the second matrix : \n");
  for(int i=0;i<row2;i++){
    for(int j=0;j<col2;j++){
      scanf("%d",&B[i][j]);
    }
  }
  printf("Multiplication matrix : \n");
  for(int i=0;i<row1;i++){
    for(int j=0;j<col2;j++){
      int count=0;
      for(int k=0;k<col1;k++){
        count+=A[i][k]*B[k][j];
      }
      printf("%d ",count);
    }
    printf("\n");
  }
  return 0;
}

