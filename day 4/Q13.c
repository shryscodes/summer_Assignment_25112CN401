// Write a program to Generate Fibonacci series.
#include<stdio.h>
int main(){
    int n, a, b, next;
    printf("Enter number of elements in the series: \n");
    scanf("%d", &n);
    a=1;
    b=0;
    for (int i = 0; i < n; i++)
    {
        printf("%d\t",b);
        next=a+b;
        b=a;
        a=next;
    }
    
    return 0;
}
