#include<stdio.h>
#include<stdlib.h>

int main(){
    int a[]={2,3,7,6,8,-1,-10,15};
    int n=sizeof(a)/sizeof(a[0]);
    int *seen=calloc(n+1,sizeof(int));

    for(int i=0;i<n;i++){
        if(a[i]>0 && a[i]<=n) seen[a[i]]=1;
    }
    for(int i=1;i<=n;i++){
        if(!seen[i]){
            printf("%d\n",i);
            return 0;
        }
    }

    printf("%d\n",n+1);
    return 0;
}
