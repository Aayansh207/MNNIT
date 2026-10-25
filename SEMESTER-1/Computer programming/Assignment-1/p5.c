#include <stdio.h>

int main(){
	int a,b;
	printf("Enter the two values : ");
	scanf("%d %d",&a,&b);
	while(b!=0){
		int c=b;
		b=a%b;
		a=c;}
	printf("The GCD is :%d\n ",a);
	return 0;
}
