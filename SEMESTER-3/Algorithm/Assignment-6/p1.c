#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define N 1000

int main(){
    int freq[N+1]={0};
    int count[N+1]={0};
    int *bucket[N+1]={NULL};

    srand(time(NULL));

    for(int i=0;i<=N;i++)
        freq[i]=rand()%100+1;

    for(int i=0;i<=N;i++)
        if(freq[i]>0)
            count[freq[i]]++;

    for(int i=1;i<=N;i++)
        if(count[i]>0)
            bucket[i]=malloc(count[i]*sizeof(int));

    int index[N+1]={0};

    for(int i=0;i<=N;i++){
        if(freq[i]>0){
            int f=freq[i];
            bucket[f][index[f]++]=i;
        }
    }

    printf("Product ID\tFrequency\n");

    for(int f=N;f>=1;f--){
        if(count[f]>0){
            for(int j=0;j<count[f];j++){
                int id=bucket[f][j];
                printf("%d\t\t%d\n",id,f);
            }
        }
    }

    for(int i=1;i<=N;i++)
        free(bucket[i]);

    return 0;
}

