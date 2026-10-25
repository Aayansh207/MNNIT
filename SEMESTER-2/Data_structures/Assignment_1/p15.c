#include<stdio.h>
#include<time.h>

int main(){
    int n;
    printf("Enter number of employees: ");
    scanf("%d",&n);
    int salary[n];
    printf("Enter salaries:\n");
    for(int i=0;i<n;i++) scanf("%d",&salary[i]);
    int comparisons=0;
    clock_t start=clock();
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            comparisons++;
            if(salary[j]>salary[j+1]){
                int temp=salary[j];
                salary[j]=salary[j+1];
                salary[j+1]=temp;
            }
        }
    }
    clock_t end=clock();
    double time_taken=(double)(end-start)/CLOCKS_PER_SEC;
    printf("Sorted salaries:\n");
    for(int i=0;i<n;i++) printf("%d ",salary[i]);
    printf("\nComparisons: %d",comparisons);
    printf("\nTime taken: %f seconds\n",time_taken);
    return 0;
}
