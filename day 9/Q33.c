// Write a program to Print reverse star pattern.
// *****
// ****
// ***
// **
// *
#include<stdio.h>
int main()
{
    int n;
    printf("Enter number of rows: \n");
    scanf("%d", &n);w
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n-i+1; j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}
