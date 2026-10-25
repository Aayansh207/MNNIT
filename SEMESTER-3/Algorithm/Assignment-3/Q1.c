#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void bubbleSort(int a[], int n){
    int i, j, temp;
    for(i=0;i<n-1;i++)
        for(j=0;j<n-i-1;j++)
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
}

double getTime(int a[], int n){
    clock_t start,end;
    start=clock();
    bubbleSort(a,n);
    end=clock();
    return (double)(end-start)/CLOCKS_PER_SEC;
}

int main(){
  FILE *f=fopen("bubble.dat","w");
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
