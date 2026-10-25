#include <stdio.h>
#include <string.h>
#include <ctype.h>
#define MAX 100
char stack[MAX];
int top = -1;
void push(char c){ stack[++top] = c; }
char pop(){ return stack[top--]; }
char peek(){ return stack[top]; }
int precedence(char c){ return (c=='+'||c=='-')?1:(c=='*'||c=='/')?2:0; }
void infixToPrefix(char infix[], char prefix[]){
    int l = strlen(infix), k=0;
    char rev[MAX], temp;
    for(int i=0;i<l;i++) rev[i]=infix[l-i-1];
    rev[l]='\0';
    for(int i=0;i<l;i++){
        if(rev[i]=='(') rev[i]=')';
        else if(rev[i]==')') rev[i]='(';
    }
    for(int i=0;i<l;i++){
        if(isalnum(rev[i])) prefix[k++]=rev[i];
        else if(rev[i]=='(') push('(');
        else if(rev[i]==')'){
            while(top!=-1 && peek()!='(') prefix[k++]=pop();
            pop();
        }else{
            while(top!=-1 && precedence(peek())>=precedence(rev[i])) prefix[k++]=pop();
            push(rev[i]);
        }
    }
    while(top!=-1) prefix[k++]=pop();
    prefix[k]='\0';
    for(int i=0;i<k/2;i++){ temp=prefix[i]; prefix[i]=prefix[k-i-1]; prefix[k-i-1]=temp; }
}
int main(){
    char infix[]="(A+B)*(C+D)", prefix[MAX];
    infixToPrefix(infix, prefix);
    printf("Prefix: %s\n", prefix);
    return 0;
}
