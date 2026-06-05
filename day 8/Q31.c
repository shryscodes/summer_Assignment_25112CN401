// Write a program to Print character triangle.
// A
// AB
// ABC
// ABCD
// ABCDE
#include<stdio.h>
int main(){
    int n;
    printf("Enter the number of rows: \n");
    scanf("%d", &n);
    for (int i = 1; i <=n ; i++)
    {
        for (int j = 65; j < 65+i; j++)
        {
            printf("%c ", j);
        }
        printf("\n");
        
    }
    
    return 0;
}
