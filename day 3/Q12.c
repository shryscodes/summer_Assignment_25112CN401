// Write a program to Find LCM of two numbers.
#include<stdio.h>
int main()
{
    int a,b, A, B, temp, LCM;
    printf("Enter two numbers that you want to get the lcm for: \n");
    scanf("%d%d", &a,&b);

    A=a;
    B=b;
    while(b!=0)
    {
        temp=b;
        b=a%b;
        a=temp;
    }

    LCM= A*B/a;
    printf("LCM of %d and %d is: %d", A,B,LCM);
    return 0;
    
}
