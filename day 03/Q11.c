//Write a program to Find GCD of two numbers.
#include<stdio.h>
int main()
{
    int a, b, A, B,temp;
    printf("Enter two number that you want to get the gcd for: \n");
    scanf("%d%d", &a,&b);
    A=a;
    B=b;
    while(b!=0)
    {
        temp=b;
        b=a%b;
        a=temp;
    }
    printf("GCD of %d and %d is: %d",A, B, a );
    return 0;

}
