#include<stdio.h>

int main(){
  char a;
  printf("Enter the alphabet : ");
  scanf("%c",&a);
  if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){printf("It is a vowel \n");}
  else{printf("It is a consonant \n");}
}
