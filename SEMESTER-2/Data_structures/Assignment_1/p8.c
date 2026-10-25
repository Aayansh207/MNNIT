#include<stdio.h>

struct Employee{
    int id;
    char name[40];
    double salary;
    int active;
};

int main(){
    FILE *fp;
    struct Employee e;
    int ch,id;
    double sal;

    while(1){
        printf("\n1 Add\n2 Search\n3 Update\n4 Delete\n0 Exit\n");
        scanf("%d",&ch);
        if(ch==0)break;
        if(ch==1){
            fp=fopen("emp.dat","ab");
            printf("id name salary:\n");
            scanf("%d %s %lf",&e.id,e.name,&e.salary);
            e.active=1;
            fwrite(&e,sizeof(e),1,fp);
            fclose(fp);
        }
        else if(ch==2){
            fp=fopen("emp.dat","rb");
            printf("id:\n");
            scanf("%d",&id);
            while(fread(&e,sizeof(e),1,fp)){
                if(e.id==id && e.active)
                    printf("%d %s %.2lf\n",e.id,e.name,e.salary);
            }
            fclose(fp);
        }
        else if(ch==3){
            fp=fopen("emp.dat","rb+");
            printf("id newSalary:\n");
            scanf("%d %lf",&id,&sal);
            while(fread(&e,sizeof(e),1,fp)){
                if(e.id==id && e.active){
                    e.salary=sal;
                    fseek(fp,-sizeof(e),SEEK_CUR);
                    fwrite(&e,sizeof(e),1,fp);
                    break;
                }
            }
            fclose(fp);
        }
        else if(ch==4){
            fp=fopen("emp.dat","rb+");
            printf("id:\n");
            scanf("%d",&id);
            while(fread(&e,sizeof(e),1,fp)){
                if(e.id==id && e.active){
                    e.active=0;
                    fseek(fp,-sizeof(e),SEEK_CUR);
                    fwrite(&e,sizeof(e),1,fp);
                    break;
                }
            }
            fclose(fp);
        }
    }
    return 0;
}

