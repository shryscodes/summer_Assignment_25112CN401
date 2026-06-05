// Write a program to Find largest prime factor.
#include<stdio.h>
int main()
{
    int n;
    printf("Enter a number: \n");
    scanf("%d", &n);
    int primes[n];
    int count=0;
    for (int i = n; i>1; i--)
    {
        int isprime=1;
        for (int j = 2; j <=i; j++)
        {
            
            if (i%j==0)
            {
                isprime=0;
                break;
            }
            
        }
        if (isprime)
        {
            primes[count]=i;
            count++;
        }
        
        
        
    }
    for (int i = count-1; i>=0 ; i--)
    {
        if (n%primes[i]==0)
        {
            printf("%d is the largest prime factor of %d", primes[i], n);
            break;
        }
        
    }
    
    
    return 0;
}
