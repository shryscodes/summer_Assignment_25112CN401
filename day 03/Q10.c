// Write a program to Print prime numbers in a
// range.
#include<stdio.h>
int main()
{
    int a, b, isprime;
    printf("Enter the range in which you want to print prime numbers: \n");
    scanf("%d%d", &a,&b);
    for (int i = a; i <=b; i++)
    {
        isprime=1;
        if(i<2)
        isprime=0;
        for (int j = 2; j*j <= i; j++)
        {
            if(i%j==0){
                isprime=0;
                break;
            }

        }
        if(isprime)
        {
            printf("%d\n", i);
        }
        
    }
    return 0;
    
}
