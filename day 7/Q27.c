// Write a program to Recursive sum of digits
#include<stdio.h>
int sum(int n)
{
    if(n==0)
    return 0;
    
    return n%10+ sum(n/10);
}
int main()
{
    int num;
    printf("Enter the number: \n");
    scanf("%d", &num);
    printf("Sum of digits of %d is %d", num, sum(num));
    return 0;
}
