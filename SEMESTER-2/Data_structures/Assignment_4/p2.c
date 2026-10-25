#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Book {
    char title[50];
    char author[50];
    struct Book* next;
};
struct Book* insertBook(struct Book* head, char title[], char author[]) {
    struct Book* newBook=(struct Book*)malloc(sizeof(struct Book));
    strcpy(newBook->title,title);
    strcpy(newBook->author,author);
    newBook->next=NULL;
    if (head==NULL) return newBook;
    struct Book* temp=head;
    while (temp->next) temp=temp->next;
    temp->next=newBook;
    return head;
}
int countBooks(struct Book* head) {
    if (head==NULL) return 0;
    return 1+countBooks(head->next);
}
int main() {
    struct Book* head = NULL;
    head = insertBook(head, "C Programming", "Dennis Ritchie");
    head = insertBook(head, "Data Structures", "Seymour Lipschutz");
    head = insertBook(head, "Algorithms", "Thomas Cormen");
    int total = countBooks(head);
    printf("Total number of books = %d\n", total);
    return 0;
}

