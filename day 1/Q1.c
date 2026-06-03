//this program prints the sum of N natural numbers
#include<stdio.h>
int main(){
    int N, sum;
    printf("Enter the value of N\n");
    scanf("%d", &N);
    sum= N*(N+1)/2;
    printf("Sum= %d", sum);
    return 0;
}
