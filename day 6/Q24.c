// Write a program to Find x^n without pow().
#include <stdio.h>
int main()
{
    int x, n, num = 1;
    printf("Input the number and its exponent: \n");
    scanf("%d%d", &x, &n);
    for (int i = 0; i < n; i++)
    {
        num *= x;
    }
    printf("%d^%d: %d", x, n, num);

    return 0;
}
