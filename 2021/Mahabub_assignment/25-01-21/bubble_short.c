#include <stdio.h>

void bubble_sort(int a[], int n) {
    int i = 0, j = 0, tmp;
    for (i = 0; i < n; i++) {   // loop n times - 1 per element
        for (j = 0; j < n - i - 1; j++) { // last i elements are sorted already
            if (a[j] > a[j + 1]) {  // swop if order is broken
                tmp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = tmp;
            }
        }
    }
}
int main() {
  printf("\n-------Short Arry using Bubbole Short Program-------\n");
  int a[100], n, i;
  printf("[+]Define your array Size ==>");
  scanf("%d", &n); 
  for (i = 0; i < n; i++)
  {
    printf("[+] Ok now you Enter for  No in Arry[%d]==>",i);
    scanf("%d", &a[i]);
  }
  bubble_sort(a, n);
  printf("\n-------======---------\n");
  printf("[+] Operation Compleate ... Now your your Shorted  Array is:===>");
  for (i = 0; i < n; i++)
  {
     printf("%d ", a[i]);
  }
  return 0;
}