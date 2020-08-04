#include<stdio.h>
#include<stdlib.h>

typedef struct  node 
{
    int data ;
    struct  node * next_ptr;
    
}node;


node * create_list(int n)
{
    int i = 0;
   node * head = NULL;
   node * temp = NULL;
   node * p = NULL;
    for (i=0;i<=n;i++) // using for loop 
    {
        temp = (node *)malloc(sizeof(node));
        printf("\n [+] OK now Enter the Deta [%d] ==>",i);
        scanf("%d",&(temp->data));
        temp->next_ptr = NULL;
        if (head==NULL)
        {
           head =temp;
        }
        else
        {
            p = head;
            while(p->next_ptr !=NULL)
            {
                p = p->next_ptr;
            }
        p->next_ptr = temp;
        }
        
    }
    return head;
}

void displaylist(node * head )
{
  node * p = head ;

  printf("\n--------------------\n[+] Finally Displaying node's .....");
    while(p->next_ptr != NULL)
    {
        
        printf("\t%d=>",p->data);
        p = p->next_ptr;
    }
}



int main ()

{
    int n = 0;
     node * head = NULL;
    printf("[+] Enter the Frist node ===>");
    scanf("%d",&n);
    head = create_list(n);
    displaylist(head);
    return 0;

}
