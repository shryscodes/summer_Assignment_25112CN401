//this program checks whether the given number is pallindrome or not
#include<stdio.h>
int main()
{
    int n, reverse=0, d, temp;
    printf("Enter a number: \n");
    scanf("%d", &n);
    temp=n;
    while(n!=0)
    {
        d=n%10;
        reverse= reverse*10+d;
        n/=10;
    }
    if(temp==reverse)
    printf("%d is a pallindrome number", temp);
    else
    printf("%d is not a pallindrome number", temp);
    return 0;
}
