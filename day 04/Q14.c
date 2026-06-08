// Write a program to Find nth Fibonacci term.
#include<stdio.h>
int main(){
    int a=0,b=1, c, n;
    printf("Enter n: \n");
    scanf("%d", &n);
    for (int i = 0; i<n; i++)
    {
        c=a+b;
        a=b;
        b=c;
    }
    printf("%dth term of fibonacci series is: %d\n", n, a);
    

    return 0;
}
