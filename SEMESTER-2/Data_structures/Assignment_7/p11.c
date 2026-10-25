#include <stdio.h>
#define N 5

int cq[N], front = -1, rear = -1;
void insert(int x) {
    if ((rear + 1) % N == front)
        printf("Overflow\n");
    else {
        if (front == -1) front = 0;
        rear = (rear + 1) % N;
        cq[rear] = x;
    }
}
void delete() {
    if (front == -1)
        printf("Underflow\n");
    else {
        printf("Deleted: %d\n", cq[front]);
        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % N;
    }
}
void display() {
    if (front == -1) {
        printf("Empty\n");
        return;
    }
    int i = front;
    while (1) {
        printf("%d ", cq[i]);
        if (i == rear) break;
        i = (i + 1) % N;
    }
    printf("\n");
}
int main() {
    insert(10); insert(20); insert(30);
    display();
    delete();
    display();
    return 0;
}
