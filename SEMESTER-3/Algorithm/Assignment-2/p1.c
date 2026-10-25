#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

int growthfunc=0;
//1-n
//2-log n
//3-n log n
//4-n^2 
//5-n(n+1)/2
int type_val=0;

int main(){
  FILE *file=fopen("Algo.txt","r");
  if(!file){printf("Not available");return 0;}
  char buffer[1000];
  int n;
  fgets(buffer,1000,file);
  sscanf(buffer,"n = %d",&n);
  int depth=0;
  int cnt=0;
  printf("n = %d\n",n);
  int iterations; 
  while(fgets(buffer,1000,file)){
    if(strstr(buffer,"{")){depth++;}
    if(strstr(buffer,"}")){depth--;}
    if(strstr(buffer,"for")){
      cnt++;
      char variable;
      char start[100];
      char end[100];
      char update[100];
      char type[100];
      sscanf(buffer,"for (%c = %[^;]; %*c%*c %[^;]; %[^)])",&variable,start,end,update);
      if(strchr(update,'*')||strchr(update,'/')){strcpy(type,"logarithmic");type_val=1;iterations+=ceil(log(n)/log(2));}
      if(strchr(start,'1')){strcpy(type,"linear");iterations+=n;type_val=2;}
      else{strcpy(type,"dependent");iterations=(n*(n+1))/2;type_val=3;}
      
      if(type_val==1){growthfunc+=2;}
      else if(type_val==2){
        if(growthfunc==0){growthfunc=1;}
        if(growthfunc==1){growthfunc=4;}
        if(growthfunc==2){growthfunc=3;}
      }
      else{
        growthfunc=5;
      }
      printf("Loop %d (depth %d) : %c=%s to %s, %s -> %s\n",cnt,depth,variable,start,end,update,type);
    }
  }
  printf("Total Iterations : %d\n",iterations);
  switch(growthfunc){
    case 1:
      printf("Growth function : n\nTime Complexity : O(n)\n");
      break;
    case 2:
      printf("Growth function : log2(n)\nTime Complexity : O(log n)\n");
      break;
    case 3:
      printf("Growth function : n log2(n)\nTime Complexity : O(n log n)\n");
      break;
    case 4:
      printf("Growth function : n^2\nTime Complexity : O(n^2)\n");
      break;
    case 5:
      printf("Growth function : n(n+1)/2\nTime Complexity : O(n^2)\n");
  }
  fclose(file);
}

