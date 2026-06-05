// Write a program to Recursive factorial
#include<stdio.h>
long long factorial(int n )
{
    if (n==0||n==1)
    {
        return 1;
    }

    return n*factorial(n-1);
}
int main()
{
    int num;
    long long fact;
    printf("Enter the number whose factorial you want to calculate: \n");
    scanf("%d", &num);
    fact = factorial(num);
    printf("Factorial of %d is: %lld", num, fact);
    return 0;

}
