// Write a program to Convert decimal to binary.
#include<stdio.h>
int main()
{
    int d, remainder, temp;
    long long b=0,power=1;
    printf("Enter number in decimal: \n");
    scanf("%d", &d);
    temp=d;
    if(d<0){
        printf("Please input a positive integer");
        return 0;
    }
    if(d==0){
        printf("0 in binary: 0");
        return 0;
    }
    while(d!=0)
    {
        remainder=d%2;
        d=d/2;
        b+=remainder*power;
        power*=10;
    
    }
    printf("%d in binary: %lld", temp, b);
    return 0;
}
