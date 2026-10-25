#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Node{
    unsigned char c;
    int f;
    struct Node *l,*r;
} Node;

Node *heap[256];
int hn=0;
char code[256][256];

void push(Node *x){
    int i=hn++;
    while(i && x->f<heap[(i-1)/2]->f){
        heap[i]=heap[(i-1)/2];
        i=(i-1)/2;
    }
    heap[i]=x;
}

Node* pop(){
    Node *x=heap[0],*y=heap[--hn];
    int i=0;
    while(2*i+1<hn){
        int j=2*i+1;
        if(j+1<hn && heap[j+1]->f<heap[j]->f) j++;
        if(y->f<=heap[j]->f) break;
        heap[i]=heap[j];
        i=j;
    }
    if(hn) heap[i]=y;
    return x;
}

void makeCode(Node *r,char *s,int d){
    if(!r->l&&!r->r){
        s[d]='\0';
        strcpy(code[r->c],s);
        return;
    }
    s[d]='0'; makeCode(r->l,s,d+1);
    s[d]='1'; makeCode(r->r,s,d+1);
}

Node* node(unsigned char c,int f,Node *l,Node *r){
    Node *x=malloc(sizeof(Node));
    x->c=c;x->f=f;x->l=l;x->r=r;
    return x;
}

int main(){
    FILE *fp=fopen("input.txt","rb");
    if(!fp){printf("File not found\n");return 0;}

    int cap=1024,n=0,f[256]={0};
    unsigned char *a=malloc(cap);
    int ch;

    while((ch=fgetc(fp))!=EOF){
        if(n==cap) a=realloc(a,cap*=2);
        a[n++]=ch;
        f[ch]++;
    }
    fclose(fp);

    printf("Original Text:\n");
    for(int i=0;i<n;i++) putchar(a[i]);

    for(int i=0;i<256;i++)
        if(f[i]) push(node(i,f[i],NULL,NULL));

    while(hn>1){
        Node *x=pop(),*y=pop();
        push(node(0,x->f+y->f,x,y));
    }

    char s[256];
    makeCode(heap[0],s,0);

    printf("\n\nHuffman Codes:\n");
    for(int i=0;i<256;i++)
        if(f[i])
            printf("%c : %s\n",i,code[i]);

    printf("\nCompressed Binary:\n");
    long bits=0;
    for(int i=0;i<n;i++){
        printf("%s",code[a[i]]);
        bits+=strlen(code[a[i]]);
    }

    printf("\n\nOriginal Bits: %ld",n*8L);
    printf("\nCompressed Bits: %ld",bits);
    printf("\nCompression Ratio: %.2f%%\n",
           100.0*bits/(n*8));

    free(a);
    return 0;
}