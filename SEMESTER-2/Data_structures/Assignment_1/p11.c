#include<stdio.h>
#include<stdlib.h>

void copyArray(int *src,int *dest,int n){
    for(int i=0;i<n;i++)
        *(dest+i)=*(src+i);
}

int main(){
    int n;
    printf("Enter number of elements: ");
    scanf("%d",&n);
    int *src=malloc(n*sizeof(int));
    int *dest=malloc(n*sizeof(int));
    if(src==NULL || dest==NULL){
        printf("Memory allocation failed\n");
        return 1;
    }
    printf("Enter elements:\n");
    for(int i=0;i<n;i++) scanf("%d",&src[i]);
    copyArray(src,dest,n);

    printf("Data copied successfully:\n");
    for(int i=0;i<n;i++) printf("%d ",dest[i]);
    free(src);
    free(dest);
    return 0;
}
