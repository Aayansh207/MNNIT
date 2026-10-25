#include <stdio.h>
#include <ctype.h>
#include <string.h>

char stack[100];
int top=-1;
void push(char x){stack[++top]=x;}
char pop(){return stack[top--];}
char peek(){return stack[top];}
int precedence(char x){
    if(x=='^')return 3;
    if(x=='*'||x=='/')return 2;
    if(x=='+'||x=='-')return 1;
    return 0;
}

void infixToPostfix(char infix[],char postfix[]){
    int i,j=0;
    top=-1;
    for(i=0;infix[i];i++){
        char ch=infix[i];
        if(isalnum(ch)){postfix[j++]=ch;}
        else if(ch=='('){push(ch);}
        else if(ch==')'){
            while(top!=-1&&peek()!='('){postfix[j++]=pop();}
            pop();
        }
        else{
            while(top!=-1&&precedence(peek())>=precedence(ch)){postfix[j++]=pop();}
            push(ch);
        }
    }
    while(top!=-1){postfix[j++]=pop();}
    postfix[j]='\0';
}
int valStack[100],vtop=-1;
void pushVal(int x){{valStack[++vtop]=x;}}
int popVal(){{return valStack[vtop--];}}
int evaluatePostfix(char postfix[]){
    int i;
    vtop=-1;
    for(i=0;postfix[i];i++){
        char ch=postfix[i];
        if(isdigit(ch)){pushVal(ch-'0');}
        else{
            int b=popVal();
            int a=popVal();
            switch(ch){
                case '+':pushVal(a+b);break;
                case '-':pushVal(a-b);break;
                case '*':pushVal(a*b);break;
                case '/':pushVal(a/b);break;
                case '^':{
                    int p=1,j;
                    for(j=0;j<b;j++)p*=a;
                    pushVal(p);
                    break;
                }
            }
        }
    }
    return popVal();
}

int main(){
    char infix[100],postfix[100];
    printf("Enter infix expression: ");
    scanf("%s",infix);
    infixToPostfix(infix,postfix);
    printf("Postfix: %s\n",postfix);
    printf("Enter postfix expression to evaluate: ");
    scanf("%s",postfix);
    printf("Result: %d\n",evaluatePostfix(postfix));
    return 0;
}