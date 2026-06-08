//this program finds the sum of digits of a number
#include<stdio.h>
int main(){
    int n, sum=0, temp, d;
    printf("Enter a number: \n");
    scanf("%d", &n);
    temp= n;
    while(n!=0){
        d= n%10;
        sum+=d;
        n/=10;
    }
    printf("The sum of digits of %d is : %d", temp, sum);
    return 0;
}
