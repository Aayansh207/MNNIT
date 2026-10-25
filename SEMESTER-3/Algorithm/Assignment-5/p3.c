#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int partition(int a[],int low,int high){
    int pivot=a[high];
    int i=low-1;
    for(int j=low;j<high;j++){
        if(a[j]<pivot){
            i++;
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    int temp=a[i+1];
    a[i+1]=a[high];
    a[high]=temp;
    return i+1;
}

void quickSort(int a[],int low,int high){
    if(low<high){
        int pi=partition(a,low,high);
        quickSort(a,low,pi-1);
        quickSort(a,pi+1,high);
    }
}

int randomizedPartition(int a[],int low,int high){
    int random=low+rand()%(high-low+1);
    int temp=a[random];
    a[random]=a[high];
    a[high]=temp;
    return partition(a,low,high);
}

void randomizedQuickSort(int a[],int low,int high){
    if(low<high){
        int pi=randomizedPartition(a,low,high);
        randomizedQuickSort(a,low,pi-1);
        randomizedQuickSort(a,pi+1,high);
    }
}

double getQuickTime(int a[],int n){
    clock_t start,end;
    start=clock();
    quickSort(a,0,n-1);
    end=clock();
    return (double)(end-start)/CLOCKS_PER_SEC;
}

double getRandomizedQuickTime(int a[],int n){
    clock_t start,end;
    start=clock();
    randomizedQuickSort(a,0,n-1);
    end=clock();
    return (double)(end-start)/CLOCKS_PER_SEC;
}

int main(){
    FILE *f=fopen("quick_compare.dat","w");
    srand(time(NULL));
    fprintf(f,"# n quick randomizedQuick\n");
    for(int n=1000;n<=20000;n+=1000){
        int quickArray[n];
        int randomizedArray[n];
        for(int i=0;i<n;i++){
            quickArray[i]=i;
            randomizedArray[i]=i;
        }
        double quickTime=getQuickTime(quickArray,n);
        double randomizedTime=getRandomizedQuickTime(randomizedArray,n);
        fprintf(f,"%d %lf %lf\n",n,quickTime,randomizedTime);
    }
    fclose(f);
    return 0;
}