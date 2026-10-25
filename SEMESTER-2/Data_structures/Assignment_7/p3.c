#include <stdio.h>
#include <ctype.h>

int s[20], top=-1;
void push(int x){ s[++top]=x; }
int pop(){ return s[top--]; }
int main(){
    char exp[]="56+7*8-";
    for(int i=0; exp[i]; i++){
        if(isdigit(exp[i])) push(exp[i]-'0');
        else{
            int b=pop(), a=pop();
            if(exp[i]=='+') push(a+b);
            else if(exp[i]=='-') push(a-b);
            else if(exp[i]=='*') push(a*b);
            else if(exp[i]=='/') push(a/b);
        }
    }
    printf("%d\n",pop());
}
