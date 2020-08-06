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
    for (i=1;i<=n;i++) // using for loop 
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


void delete_1st_node(node * head)
{
    node * temp;
    temp = head;
    head = head->next_ptr;
    free(temp);
    printf("\n--------------------\n[+]   Displaying node's  after Delete 1st node.....");
    while(head->next_ptr != NULL)
    {
        
        printf("\t%d=>",head->data);
        head = head->next_ptr;
    }


}

void count_in_list(node * head)

{
    int count= 0;
    node * current = head;
    while(current !=NULL)
    {
        count++;
        current = current->next_ptr;

    }
    printf("\n\n-----------\n[+]Link list length is ===>%d\n",count);
}




int main ()

{
    int n = 0;
     node * head = NULL;
    printf("[+] Enter the Frist node ===>");
    scanf("%d",&n);
    head = create_list(n);
    count_in_list(head);
    displaylist(head);
    delete_1st_node(head);
   

    return 0;

}
