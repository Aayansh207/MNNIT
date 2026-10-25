#include <stdio.h>
#include <string.h>

char st[50]; int top=-1;
void push(char c){ st[++top]=c; }
char pop(){ return st[top--]; }
int main(){
    char str[50];
    scanf("%s", str);
    for(int i=0; str[i]; i++) push(str[i]);
    for(int i=0; i<strlen(str); i++) str[i]=pop();
    printf("%s\n", str);
}
