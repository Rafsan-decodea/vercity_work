#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct linked_list
{
    int roll;
    char name[30];
    double cgpa;
    struct linked_list *next;
};

typedef struct linked_list node;
node* head = NULL;
node* tptr = NULL;
node* nptr = NULL;
node* tempnode = NULL;

void insert(int Roll, char Name[20], double Cgpa)
{

    nptr = (node *)malloc (sizeof(node));
    nptr->roll = Roll;
    strcpy(nptr->name,Name);// This is for  Str Copy for  to the List
    nptr->cgpa = Cgpa;
    nptr->next = NULL;

    tptr = head;

    if(head == NULL)
    {
        head= nptr;
        return;
    }
    if(Roll < tptr->roll)
    {
        head = nptr;
        nptr->next = tptr;
        return;
    }
     while(Roll >= tptr->roll) {

         if(tptr->next == NULL) {
            tptr->next = nptr;
            return;
        }

        tempnode = tptr;
        tptr = tptr->next;
     }

     if(Roll < tptr->roll) {
        tempnode->next = nptr;
        nptr->next = tptr;
     }

}

void search(int roll_no)
{



    tptr =  head;
    while(tptr->roll != roll_no)
    {
        if(tptr->next == NULL)
        {
            printf("[OPPS➭➭➭➭➭➭] Roll no %d is not found!!!\n\n",roll_no);
            break;
        }
        tptr = tptr->next;
    }

    if(tptr->roll == roll_no)
    {
        printf("[▶]Roll Number <===> %d\n",tptr->roll);
        printf("[▶]Name <===> %s\n",tptr->name);
        printf("[▶]CGPA <===> %.2lf\n\n",tptr->cgpa);
    }
}

void deleting(int roll_no)
{



    tptr = head;
    if(head == NULL)
    {
        printf("Rcord with roll number %d is not found\n\n",roll_no);
        return;
    }

    if(roll_no == tptr->roll)
    {
        head = tptr->next;
        //delete(tptr);
        free(tptr);
        printf("Rcord with roll number %d is found\n",roll_no);
        printf("Rcord deleted successfully!!!\n\n");
        return;
    }
    while(roll_no != tptr->roll)
    {
        if(tptr->next == NULL)
        {
            printf("Rcord with roll number %d is not found\n\n",roll_no);
            return;
        }
        tempnode = tptr;
        tptr = tptr->next;
    }
    if(roll_no == tptr->roll)
    {
        if(tptr->next == NULL){
            tempnode->next = NULL;
        }

        else{
            tempnode->next = tptr->next;
        }

        printf("[✪✪✪]  %d is found\n",roll_no);
        printf("[X] Successfully deleted :) \n\n");
        //delete(tptr);
        free(tptr);
    }
}

void update(char Name[30],double Cgpa, int roll_no)
{


    tptr = head;

    while(tptr->roll != roll_no)
    {
        if(tptr->next == NULL)
        {
            printf("[opps ➭➭➭]Roll no %d is not found!!!\n",roll_no);
            break;
        }
        tptr = tptr->next;
    }

    if(tptr->roll == roll_no){
        printf("[OPPS➭➭➭] Roll  %d is not found !!!\n",roll_no);
        printf("[▶]Enter new name ====>");
        fflush(stdin);
        gets(Name);
        printf("[▶] Enter new cgpa===> ");
        scanf("%lf",&Cgpa);

        strcpy(tptr->name,Name);
        tptr->cgpa = Cgpa;
        printf("[✪✪✪] Updation successfull :) \n\n");
    }

}

void display(node* head)
{
    tptr = head;
    if(tptr == NULL){
        return;
    }
    else{
        printf("[☞]Roll number : %d\n",tptr->roll);
        printf("[☞]Name : %s\n",tptr->name);
        printf("[☞]Cgpa : %.2lf\n\n",tptr->cgpa);
        display(tptr->next);
    }
}



int main()
{
    printf();
}