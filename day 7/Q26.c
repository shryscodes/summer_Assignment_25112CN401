// Write a program to Recursive Fibonacci
#include <stdio.h>
int fibonacci(int n)
{
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;

    return fibonacci(n - 1) + fibonacci(n - 2);
}
int main()
{
    int n;
    printf("Enter the number of terms in the series: \n");
    scanf("%d", &n);
    printf("Fibonacci series...\n");
    for (int i = 1; i <= n; i++)
    {
        printf("%d\t", fibonacci(i));
    }
    return 0;
}
