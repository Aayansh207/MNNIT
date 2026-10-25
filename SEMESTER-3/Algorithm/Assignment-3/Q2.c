#include <stdio.h>
#include <time.h>

void bubbleSort(int a[], int n){
    int i,j,temp;
    for(i=0;i<n-1;i++)
        for(j=0;j<n-i-1;j++)
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
}

void optimizedBubbleSort(int a[], int n){
    int i,j,temp,flag;
    for(i=0;i<n-1;i++){
        flag=0;
        for(j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=1;
            }
        }
        if(flag==0){break;}
    }
}

double standardTime(int a[],int n){
    clock_t s,e;
    s=clock();
    bubbleSort(a,n);
    e=clock();
    return (double)(e-s)/CLOCKS_PER_SEC;
}

double optimizedTime(int a[],int n){
    clock_t s,e;
    s=clock();
    optimizedBubbleSort(a,n);
    e=clock();
    return (double)(e-s)/CLOCKS_PER_SEC;
}

int main(){
    FILE *f=fopen("compare.dat","w");
    fprintf(f,"# n standard optimized\n");
    for(int n=6000;n<=10000;n+=500){
        int a[n],b[n];
        for(int j=0;j<n;j++){a[j]=b[j]=j;}
        fprintf(f,"%d %lf %lf\n",n,standardTime(a,n),optimizedTime(b,n));
    }
    fclose(f);
    return 0;
}
