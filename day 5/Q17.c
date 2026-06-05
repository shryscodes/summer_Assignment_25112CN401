// Write a program to Check perfect number.
#include<stdio.h>
int main(){
    int n, sum=0;
    printf("Enter the number you want to check is perfect or not : \n");
    scanf("%d", &n);
    for (int i = 1; i <=n/2; i++)
    {
        if(n%i==0)
        {
            sum+=i;
        }
    }
    if(n==sum)
    printf("%d is a perfect number", n);
    else
    printf("%d is not a perfect number as sum of its divisors: %d", n, sum);
    
    return 0;
}
