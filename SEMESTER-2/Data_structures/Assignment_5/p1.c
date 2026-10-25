#include<stdio.h>
#include<stdlib.h>
struct Node{
  int id,salary;
  long long phno;
  char name[100];
  char dept[100];
  char designation[100];
  struct Node* next;
  struct Node* prev;
};

struct Node* insert_end(struct Node* head){
  struct Node* temp=(struct Node*)malloc(sizeof(struct Node));
  temp->next=NULL;
  temp->prev=NULL;
  printf("Enter the ID : ");
  scanf("%d",&(temp->id));
  printf("Enter the salary : ");
  scanf("%d",&(temp->salary));
  printf("Enter the phone no. : ");
  scanf("%lld",&(temp->phno));
  printf("Enter the name : ");
  scanf("%s",temp->name);
  printf("Enter the department : ");
  scanf("%s",temp->dept);
  printf("Enter the designation : ");
  scanf("%s",temp->designation);
  if(head==NULL){return temp;}
  struct Node* mover=head;
  while(mover->next) mover=mover->next;
  mover->next=temp;
  temp->prev=mover;
  return head;
} 

struct Node* insert_front(struct Node* head){
  struct Node* temp=(struct Node*)malloc(sizeof(struct Node));
  temp->next=head;
  temp->prev=NULL;
  printf("Enter the ID : ");
  scanf("%d",&(temp->id));
  printf("Enter the salary : ");
  scanf("%d",&(temp->salary));
  printf("Enter the phone no. : ");
  scanf("%lld",&(temp->phno));
  printf("Enter the name : ");
  scanf("%s",temp->name);
  printf("Enter the department : ");
  scanf("%s",temp->dept);
  printf("Enter the designation : ");
  scanf("%s",temp->designation);
  if(head!=NULL) head->prev=temp;
  return temp;
} 

struct Node* insert_at_x(struct Node* head){
    struct Node* temp=(struct Node*)malloc(sizeof(struct Node));
    printf("Enter the id of the employee next to which you want to insert : ");
    int x;scanf("%d",&x);
    struct Node* mover=head;
    while(mover!=NULL && mover->id!=x) mover=mover->next;
    if(mover==NULL){
        printf("The required value was not found\n");
        free(temp);
        return head;
    }
    printf("Enter the ID : ");
    scanf("%d",&(temp->id));
    printf("Enter the salary : ");
    scanf("%d",&(temp->salary));
    printf("Enter the phone no. : ");
    scanf("%lld",&(temp->phno));
    printf("Enter the name : ");
    scanf("%s",temp->name);
    printf("Enter the department : ");
    scanf("%s",temp->dept);
    printf("Enter the designation : ");
    scanf("%s",temp->designation);
    temp->next = mover->next;
    temp->prev = mover;
    if(mover->next != NULL) mover->next->prev=temp;
    mover->next=temp;
    return head;
}

struct Node* delete_end(struct Node* head){
    if(head==NULL) return head;
    struct Node* temp=head;
    if(temp->next==NULL){
        free(temp);
        return NULL;
    }
    while(temp->next!=NULL)temp=temp->next;
    temp->prev->next=NULL;
    free(temp);
    return head;
}

struct Node* delete_front(struct Node* head){
    if(head==NULL)return NULL;
    if(head->next==NULL){free(head);return NULL;}
    struct Node* temp=head->next;
    temp->prev=NULL;
    free(head);
    return temp;
}

struct Node* delete_after_id(struct Node* head){
    if(head==NULL) return head;
    int x;scanf("%d",&x);
    struct Node* mover=head;
    while(mover!=NULL && mover->id!=x) mover=mover->next;
    if(mover==NULL || mover->next==NULL) return head;
    struct Node* temp=mover->next;
    mover->next=temp->next;
    if(temp->next!=NULL) temp->next->prev=mover;
    free(temp);
    return head;
}

void printDLL(struct Node* head){
    if(head == NULL){
        printf("List is empty\n");
        return;
    }
    struct Node* temp=head;
    printf("Employee Details:\n");
    while(temp!=NULL){
        printf("ID : %d\n",temp->id);
        printf("Salary : %d\n",temp->salary);
        printf("Phone : %lld\n",temp->phno);
        printf("Name : %s\n",temp->name);
        printf("Department : %s\n",temp->dept);
        printf("Designation : %s\n",temp->designation);
        temp=temp->next;
    }
}

void find_max_salary(struct Node* head){
    if(head==NULL){
        printf("List is empty\n");
        return;
    }
    struct Node* max=head;
    struct Node* temp=head->next;
    while(temp!=NULL){
        if(temp->salary > max->salary) max=temp;
        temp=temp->next;
    }
    printf("\nEmployee with Maximum Salary:\n");
    printf("ID : %d\n",max->id);
    printf("Salary : %d\n",max->salary);
    printf("Phone : %lld\n",max->phno);
    printf("Name : %s\n",max->name);
    printf("Department : %s\n",max->dept);
    printf("Designation : %s\n",max->designation);
}

void find_min_salary(struct Node* head){
    if(head == NULL){
        printf("List is empty\n");
        return;
    }
    struct Node* min=head;
    struct Node* temp=head->next;
    while(temp != NULL){
        if(temp->salary < min->salary)min=temp;
        temp=temp->next;
    }
    printf("\nEmployee with Minimum Salary:\n");
    printf("ID : %d\n",min->id);
    printf("Salary : %d\n",min->salary);
    printf("Phone : %lld\n",min->phno);
    printf("Name : %s\n",min->name);
    printf("Department : %s\n",min->dept);
    printf("Designation : %s\n",min->designation);
}

int main(){
    struct Node* head=NULL;
    int choice;
    while(1){
        printf("\nSelect your choice : \n");
        printf("1 : Insert employee at end\n");
        printf("2 : Delete employee from end\n");
        printf("3 : Insert employee at front\n");
        printf("4 : Delete employee from front\n");
        printf("5 : Insert employee after given ID\n");
        printf("6 : Delete employee after given ID\n");
        printf("7 : Print the DLL\n");
        printf("8 : Find the maximum salary\n");
        printf("9 : Find the minimum salary\n");
        printf("10 : Exit\n");
        printf("Your Input : ");
        scanf("%d", &choice);
        switch(choice){
            case 1:
                head = insert_end(head);
                break;
            case 2:
                head = delete_end(head);
                break;
            case 3:
                head = insert_front(head);
                break;
            case 4:
                head = delete_front(head);
                break;
            case 5:
                head = insert_at_x(head);
                break;
            case 6:
                printf("Enter ID after which to delete: ");
                head = delete_after_id(head);
                break;
            case 7:
                printDLL(head);
                break;
            case 8:
                find_max_salary(head);
                break;
            case 9:
                find_min_salary(head);
                break;
            case 10:
                printf("Exiting program...\n");
                return 0;
            default:
                printf("Invalid choice. Try again.\n");
        }
    }
    return 0;
}
