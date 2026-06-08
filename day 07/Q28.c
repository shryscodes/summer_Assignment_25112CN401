// Write a program to Recursive reverse number
#include<stdio.h>
int rev=0;
int reverse(int n)
{
   static int rev=0;
   if(n==0)
   return rev;
   
   rev= rev*10+ n%10;
   reverse(n/10);
}
int main()
{
    int num;
    printf("Enter a number: \n");
    scanf("%d", &num);
    printf("Reversed number: %d", reverse(num));
    return 0;
}
