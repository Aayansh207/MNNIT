#include <stdio.h>
#include <string.h>

#define N 100

typedef struct{
    int id,priority;
    char name[30];
} Process;

Process q[N];
int n=0;

void insert(int id,int p,char name[]){
    q[n].id=id;
    q[n].priority=p;
    strcpy(q[n].name,name);
    n++;
}

int highest(){
    int k=0;
    for(int i=1;i<n;i++)
        if(q[i].priority>q[k].priority)
            k=i;
    return k;
}

void peek(){
    if(!n) return;
    int k=highest();
    printf("Highest: ID=%d Priority=%d %s\n",
           q[k].id,q[k].priority,q[k].name);
}

void removeProcess(){
    if(!n) return;
    int k=highest();
    printf("Executed: ID=%d Priority=%d %s\n",
           q[k].id,q[k].priority,q[k].name);
    for(int i=k;i<n-1;i++) q[i]=q[i+1];
    n--;
}

void changePriority(int id,int p){
    for(int i=0;i<n;i++)
        if(q[i].id==id){
            q[i].priority=p;
            return;
        }
}

void display(){
    for(int i=0;i<n;i++)
        printf("%d\t%d\t%s\n",q[i].id,q[i].priority,q[i].name);
}

int main(){
    insert(1,10,"Interrupt Handling");
    insert(2,8,"System Maintenance");
    insert(3,5,"User Application");
    insert(4,3,"Background Task");
    insert(5,8,"File System");
    insert(6,6,"Network Service");
    insert(7,4,"Backup Task");
    insert(8,5,"Database");
    insert(9,2,"Logging");
    insert(10,1,"Idle Task");

    printf("Initial Queue:\n");
    display();

    peek();
    changePriority(4,9);
    printf("\nAfter Priority Change:\n");
    display();

    removeProcess();
    printf("\nAfter Removal:\n");
    display();

    return 0;
}