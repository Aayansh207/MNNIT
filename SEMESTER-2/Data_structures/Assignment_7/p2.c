#include <stdio.h>
#include <ctype.h>
#include <string.h>

int s[20], top=-1;
void push(int x){ s[++top]=x; }
int pop(){ return s[top--]; }
int main(){
    char exp[]="+-7*45+20";
    for(int i=strlen(exp)-1;i>=0;i--){
        if(isdigit(exp[i])) push(exp[i]-'0');
        else{
            int a=pop(), b=pop();
            if(exp[i]=='+') push(a+b);
            else if(exp[i]=='-') push(a-b);
            else if(exp[i]=='*') push(a*b);
            else if(exp[i]=='/') push(a/b);
        }
    }
    printf("%d\n",pop());
}
