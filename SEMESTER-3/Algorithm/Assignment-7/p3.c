#include <stdio.h>

typedef struct{
    int id,start,end;
} Job;

void sort(Job a[],int n){
    for(int i=0;i<n-1;i++)
        for(int j=0;j<n-i-1;j++)
            if(a[j].end>a[j+1].end){
                Job t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
}

int main(){
    Job a[]={
        {1,1,4},{2,3,5},{3,0,6},{4,5,7},{5,3,9},
        {6,5,9},{7,6,10},{8,8,11},{9,8,12},{10,2,14}
    };
    int n=10,last=-1,count=0;

    sort(a,n);

    printf("Selected Meetings:\n");

    for(int i=0;i<n;i++)
        if(a[i].start>=last){
            printf("Job %d: %d-%d\n",
                   a[i].id,a[i].start,a[i].end);
            last=a[i].end;
            count++;
        }

    printf("Maximum Meetings = %d\n",count);
    return 0;
}