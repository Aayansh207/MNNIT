#include <stdio.h>
#include <string.h>

#define MAX 100

char stack[MAX];
int top = -1;

void push(char c) { stack[++top] = c; }
char pop() { return stack[top--]; }
char peek() { return stack[top]; }

int isMatching(char open, char close) {
    return (open=='(' && close==')') ||
           (open=='{' && close=='}') ||
           (open=='[' && close==']');
}

int isBalanced(char *expr) {
    int i;
    for(i=0; expr[i]; i++) {
        if(expr[i]=='(' || expr[i]=='{' || expr[i]=='[')
            push(expr[i]);
        else if(expr[i]==')' || expr[i]=='}' || expr[i]==']') {
            if(top==-1 || !isMatching(pop(), expr[i]))
                return 0; // unbalanced
        }
    }
    return top==-1; // true if stack is empty
}

int main() {
    char expr[256];
    printf("Enter expression: ");
    fgets(expr, sizeof(expr), stdin);
    expr[strcspn(expr, "\n")] = 0; // remove newline
    if(isBalanced(expr))
        printf("Parentheses are balanced.\n");
    else
        printf("Parentheses are NOT balanced.\n");
    return 0;
}
