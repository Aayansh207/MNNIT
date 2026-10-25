#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int n=20;
    int a[20];
    int c[1001]={0};
    srand(time(0));

    for(int i=0;i<n;i++){
        a[i]=rand()%1001;
        c[a[i]]++;
    }

    printf("Random data: ");
    for(int i=0;i<n;i++)
        printf("%d ",a[i]);

    for(int r=0;r<10;r++){
        int l=r*100;
        int u=(r==9) ? 1000:l+99;
        int b[20];
        int k=0;

        for(int x=l;x<=u;x++)
            while(c[x]--){
              b[k++]=x;
            }
        printf("\n\n[%d,%d] Count=%d\nSorted: ",l,u,k);
        for(int i=0;i<k;i++){printf("%d ",b[i]);}
        if(k==0)
            printf("\nMedian: none");
        else if(k%2)
            printf("\nMedian: %d",b[k/2]);
        else
            printf("\nMedian: %.2f",(b[k/2-1]+b[k/2])/2.0);
    }
    printf("\n");
    return 0;
}

