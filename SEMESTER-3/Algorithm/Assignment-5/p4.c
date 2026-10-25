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

double getRandomizedTime(int a[],int n){
    clock_t start,end;
    start=clock();
    randomizedQuickSort(a,0,n-1);
    end=clock();
    return (double)(end-start)/CLOCKS_PER_SEC;
}

void copyArray(int source[],int destination[],int n){
    for(int i=0;i<n;i++){destination[i]=source[i];}
}

void generateBestCase(int a[],int low,int high,int *value){
    if(low>high){return;}
    int mid=(low+high)/2;
    generateBestCase(a,low,mid-1,value);
    generateBestCase(a,mid+1,high,value);
    a[high]=(*value)++;
}

int main(){
    FILE *best=fopen("best.dat","w");
    FILE *average=fopen("average.dat","w");
    srand(time(NULL));
    fprintf(best,"# n quick randomized\n");
    fprintf(average,"# n quick randomized\n");
    for(int n=1000;n<=20000;n+=1000){
        int original[n];
        int quickArray[n];
        int randomizedArray[n];
        for(int i=0;i<n;i++){original[i]=rand();}
        copyArray(original,quickArray,n);
        copyArray(original,randomizedArray,n);
        double quickAverage=getQuickTime(quickArray,n);
        double randomizedAverage=getRandomizedTime(randomizedArray,n);
        fprintf(average,"%d %lf %lf\n",n,quickAverage,randomizedAverage);
        int value=0;
        generateBestCase(original,0,n-1,&value);
        copyArray(original,quickArray,n);
        copyArray(original,randomizedArray,n);
        double quickBest=getQuickTime(quickArray,n);
        double randomizedBest=getRandomizedTime(randomizedArray,n);
        fprintf(best,"%d %lf %lf\n",n,quickBest,randomizedBest);
    }
    fclose(best);
    fclose(average);
    return 0;
}