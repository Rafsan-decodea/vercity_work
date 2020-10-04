#include<stdio.h>
#include<stdlib.h>

int main()
{
   FILE *file;
   char  name[100];
   char  father_name[100] ;
   char  mother_name[100];
   char age[100] ;
   file = fopen("F:/c++/t.txt","w");
   printf("[+]Your Name is ===>");
   gets(name);
   printf("[+]Your age ===>");
   gets(age);
   printf("[+]Your Father name ===>");
   gets(father_name);
   printf("[+]Your Mother Name==>");
   gets(mother_name);
   char margine[200]="-------------About My Self----------";
   fprintf(file, "%s\n",margine);
   fprintf(file,"Name :\t%s\nAge:\t %s\nFatherName:\t%s\nMother Name:\t%s\n",name,age,father_name,mother_name);
   printf("\n\nFiles Written is Success!!!!!!!!!");
   system("explorer t.txt");
   fclose(file);
    
}