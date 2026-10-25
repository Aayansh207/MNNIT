#include<stdio.h>

int main(){
    int n,key;
    printf("Enter number of students: ");
    scanf("%d",&n);

    int scores[n];
    printf("Enter sorted scores:\n");
    for(int i=0;i<n;i++) scanf("%d",&scores[i]);

    printf("Enter score to search: ");
    scanf("%d",&key);
    int low=0,high=n-1;
    while(low<=high){
        int mid=(low+high)/2;

        if(scores[mid]==key){
            printf("Score found at position %d\n",mid);
            return 0;
        }
        else if(key<scores[mid])
            high=mid-1;
        else
            low=mid+1;
    }

    printf("Score not found\n");
    return 0;
}
