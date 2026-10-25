#include <stdio.h>
#include <stdlib.h>
#define MAX 100
int queue[MAX], front = -1, rear = -1;
void enqueue(int x) {
    if (rear == MAX - 1) {
        printf("Queue Overflow\n");
        return;
    }
    if (front == -1) front = 0;
    queue[++rear] = x;
}
int dequeue() {
    if (front == -1 || front > rear) {
        printf("Queue Underflow\n");
        return -1;
    }
    return queue[front++];
}
void display() {
    if (front == -1 || front > rear) {
        printf("Queue is empty\n");
        return;
    }
    for (int i = front; i <= rear; i++)
        printf("%d ", queue[i]);
    printf("\n");
}

void deleteNth(int n) {
    int size = rear - front + 1;
    if (front == -1 || size == 0) {
        printf("Error: Queue is empty\n");
        return;
    }
    if (n <= 0 || n > size) {
        printf("Error: Invalid position\n");
        return;
    }
    int temp[MAX], k = 0;
    for (int i = 1; i < n; i++)
        temp[k++] = dequeue();
    int deleted = dequeue();
    for (int i = 0; i < k; i++)
        enqueue(temp[i]);
    printf("Deleted element: %d\n", deleted);
}
int main() {
    printf("Insert some elements into the queue:\n");
    enqueue(1);
    enqueue(2);
    enqueue(3);
    enqueue(4);
    enqueue(5);
    printf("Queue elements are: ");
    display();
    printf("Delete the 7th element of the said queue:\n");
    deleteNth(7);
    printf("Delete the 3rd element of the said queue:\n");
    deleteNth(3);
    printf("Queue elements are: ");
    display();
    return 0;
}
