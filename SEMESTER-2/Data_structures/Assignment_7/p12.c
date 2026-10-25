#include <stdio.h>
#define N 5

int pq[N], size = 0;
void insert(int x) {
    if (size == N)
        printf("Overflow\n");
    else {
        int i = size - 1;
        while (i >= 0 && pq[i] < x) {
            pq[i + 1] = pq[i];
            i--;
        }
        pq[i + 1] = x;
        size++;
    }
}
void delete() {
    if (size == 0)
        printf("Underflow\n");
    else
        printf("Deleted: %d\n", pq[--size]);
}
void display() {
    if (size == 0) {
        printf("Empty\n");
        return;
    }
    for (int i = 0; i < size; i++)
        printf("%d ", pq[i]);
    printf("\n");
}
int main() {
    insert(30); insert(10); insert(50);
    display();
    delete();
    display();
    return 0;
}
