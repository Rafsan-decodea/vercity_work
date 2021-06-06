#include <stdio.h>
#include <stdlib.h>



struct Node
{
    int data;
    struct Node* next;
};

void  printdata(struct Node* n)
{
    while(n !=NULL)
    {
        printf(" %d ",n->data);
        n = n->next;
    }

}


int main()
{
  struct   Node* head = NULL;
  struct   Node* value1 = NULL;
  struct   Node* value2 = NULL;

    head = (struct Node*)malloc(sizeof(struct Node));
    value1 = (struct Node*)malloc(sizeof(struct Node));
    value2 = (struct Node*)malloc(sizeof(struct Node));

    head->data = 1;
    head->next = value1;
    value1->data = 2;
    value1->next = value2;
    value2->data = 0;
    value2->next = NULL;

    printdata(head);


}
