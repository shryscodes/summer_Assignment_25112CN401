// Write a program to Check whether a number is
// prime.
#include<stdio.h>
int main(){
    int n, isprime=1;
    printf("Enter the number you want to check is prime or not: \n");
    scanf("%d", &n);
    
    if(n<2)
    isprime=0;
    else if(n==2)
    isprime=1;
    else if(n%2==0)
    isprime=0;
    else{
        for (int i = 3; i*i <=n; i+=2  )
        {   
            if(n%i==0){
            isprime=0;
            break;}
            
        }
        
    }
    if(isprime)
    printf("%d is a prime number", n);
    else
    printf("%d is not prime number", n);
    
    return 0;
}
