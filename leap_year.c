#include <stdio.h>

void leapyear(int year)
{
    if (year % 4 == 0) {
        if (year % 100 == 0) {
           
            if (year % 400 == 0)
                printf(" \n %d is a leap year. \n", year);
            else
                printf("\n%d is not a leap year.\n", year);
        } else
            printf("\n %d is a leap year.\n", year);
    } else
        printf("\n %d is not a leap year.n \n", year);
}


int main() {
    int year;
    printf("\n Enter a year: ");
    scanf("%d", &year);
    leapyear(year);
    return 0;
}