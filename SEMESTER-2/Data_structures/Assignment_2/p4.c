#include<stdio.h>
int main(){
    int n,i,j,t,a[100],c=0;
    scanf("%d",&n);
    for(i=0;i<n;i++) scanf("%d",&a[i]);
    for(i=1;i<n;i++){
        j=i;
        while(j>0 && a[(j-1)/2]<a[j]){
            t=a[j];
            a[j]=a[(j-1)/2];
            a[(j-1)/2]=t;
            j=(j-1)/2;
            c++;
        }
    }
    for(i=n-1;i>0;i--){
        t=a[0];
        a[0]=a[i];
        a[i]=t;
        j=0;
        while(2*j+1 < i){
            int k=2*j+1;
            if(k+1<i && a[k] < a[k+1])
                k++;
            if(a[j] < a[k]){
                t=a[j];
                a[j]=a[k];
                a[k]=t;
                j=k;
                c++;
            }
            else
                break;
        }
    }
    for(i=0;i<n;i++) printf("%d ",a[i]);
    printf("\nComparisons:%d",c);
    printf("\n");
}

