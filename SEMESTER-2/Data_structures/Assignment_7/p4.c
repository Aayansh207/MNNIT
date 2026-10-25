#include <stdio.h>
#include <ctype.h>

int val[20], vtop=-1;
char op[20]; int otop=-1;
void pushVal(int x){ val[++vtop]=x; }
int popVal(){ return val[vtop--]; }
void pushOp(char x){ op[++otop]=x; }
char popOp(){ return op[otop--]; }
int apply(int a,int b,char op){
    if(op=='+') return a+b;
    if(op=='-') return a-b;
    if(op=='*') return a*b;
    if(op=='/') return a/b;
}
int prec(char c){
    if(c=='+'||c=='-') return 1;
    if(c=='*'||c=='/') return 2;
    return 0;
}
int main(){
    char exp[]="150*(20+10)/15";
    for(int i=0; exp[i]; i++){
        if(isdigit(exp[i])){
            int num=0;
            while(isdigit(exp[i])) num=num*10+(exp[i++]-'0');
            pushVal(num); i--;
        }
        else if(exp[i]=='(') pushOp(exp[i]);
        else if(exp[i]==')'){
            while(op[otop]!='('){
                int b=popVal(), a=popVal();
                pushVal(apply(a,b,popOp()));
            }
            popOp();
        }
        else{
            while(otop>=0 && prec(op[otop])>=prec(exp[i])){
                int b=popVal(), a=popVal();
                pushVal(apply(a,b,popOp()));
            }
            pushOp(exp[i]);
        }
    }
    while(otop>=0){
        int b=popVal(), a=popVal();
        pushVal(apply(a,b,popOp()));
    }
    printf("%d\n",popVal());
}
