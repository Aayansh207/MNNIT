#include<stdio.h>

int main(){
        int a=5;
	float b=6.45;
	double c=8.56;
	char d='A';
	printf("Integer : %lu\n",sizeof(a));
	printf("Float : %lu\n",sizeof(b));
	printf("Double : %lu\n",sizeof(c));
	printf("Char : %lu\n",sizeof(d));
	return 0;
}
