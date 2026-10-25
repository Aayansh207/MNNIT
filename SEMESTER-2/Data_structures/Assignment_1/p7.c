#include<stdio.h>

struct student{
  int roll;
  int marks;
};

int main(){
  struct student* Aayansh;
  printf("Enter the roll number");
  scanf("%d",&(Aayansh->roll));
  printf("Enter the marks");
  scanf("%d",&(Aayansh->marks));
  printf("Roll number : %d\n",Aayansh->roll);
  printf("Marks : %d\n",Aayansh->marks);
  }
