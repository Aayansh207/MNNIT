#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void insertionSort(int a[], int n){
    int i,j,key;
    for(i=1;i<n;i++){
        key=a[i];
        j=i-1;
        while(j>=0 && a[j]>key){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
    }
}

double getTime(int a[], int n){
    clock_t start,end;
    start=clock();
    insertionSort(a,n);
    end=clock();
    return (double)(end-start)/CLOCKS_PER_SEC;
}

int main(){
  FILE *f=fopen("insertion.dat","w");
  srand(time(NULL));
  fprintf(f,"# n best worst average\n");
  for(int n=6000;n<=10000;n+=1000){
    int best[n],worst[n],avg[n];
    for(int i=0;i<n;i++){
        best[i]=i;
        worst[i]=n-i;
        avg[i]=rand()%1000;
    }
    fprintf(f,"%d %lf %lf %lf\n",n,getTime(best,n),getTime(worst,n),getTime(avg,n));
  }
  fclose(f);
  return 0;
}
