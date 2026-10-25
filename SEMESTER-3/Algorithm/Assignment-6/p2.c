#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define N 10000

void radixSort(unsigned int a[], int n) {
    unsigned int *b=malloc(n*sizeof(unsigned int));
    for(int bit=0;bit<32;bit++){
        int count[2]={0,0};
        for(int i=0;i<n;i++){count[(a[i]>>bit)&1]++;}
        int pos[2]={0,count[0]};
        for(int i=0;i<n;i++){
            int x=(a[i]>>bit)&1;
            b[pos[x]++]=a[i];
        }
        for(int i=0;i<n;i++){
           a[i]=b[i];
        }
    }
    free(b);
}

int main() {
    unsigned int a[N];
    srand(time(NULL));
    for(int i=0;i<N;i++){
        a[i]=((unsigned int)rand()<<16) | rand();
    }
    clock_t start = clock();
    radixSort(a, N);
    clock_t end = clock();
    printf("Time: %.3f ms\n",(double)(end-start)*1000/CLOCKS_PER_SEC);
    printf("First 10 elements:\n");
    for(int i=0;i<10;i++)
        printf("%u ",a[i]);
    return 0;
}

