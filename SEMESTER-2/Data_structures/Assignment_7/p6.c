#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define MAX 100

char stack[MAX];
int top = -1;

void push(char c) { stack[++top] = c; }
char pop() { return stack[top--]; }
char peek() { return stack[top]; }
int precedence(char c) {
    if(c=='+'||c=='-') return 1;
    if(c=='*'||c=='/') return 2;
    return 0;
}

void infixToPrefix(char *infix, char *prefix) {
    int i, k=0, len = strlen(infix);
    char rev[MAX], temp;
    // Reverse the infix and swap '(' with ')'
    for(i=0;i<len;i++){
        temp = infix[len-1-i];
        rev[i] = (temp=='(')?')':(temp==')'?'(':temp);
    }
    rev[len] = '\0';
    
    // Standard infix to postfix on reversed string
    for(i=0;i<len;i++){
        if(isalnum(rev[i]))
            prefix[k++] = rev[i];
        else if(rev[i]=='(')
            push(rev[i]);
        else if(rev[i]==')'){
            while(top!=-1 && peek()!='(')
                prefix[k++] = pop();
            pop();
        } else {
            while(top!=-1 && precedence(peek())>=precedence(rev[i]))
                prefix[k++] = pop();
            push(rev[i]);
        }
    }
    while(top!=-1) prefix[k++] = pop();
    prefix[k]='\0';

    // Reverse the result to get prefix
    for(i=0;i<k/2;i++){
        temp = prefix[i];
        prefix[i] = prefix[k-1-i];
        prefix[k-1-i] = temp;
    }
}

int main() {
    char infix[MAX], prefix[MAX];
    printf("Enter infix expression: ");
    scanf("%s", infix);
    infixToPrefix(infix, prefix);
    printf("Prefix expression: %s\n", prefix);
    return 0;
}
