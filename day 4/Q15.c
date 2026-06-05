// Write a program to Check Armstrong number
#include<stdio.h>
#include<math.h>
int main(){
    int n, temp, digit=0, remainder, result=0;
    printf("Enter the number you want to check is armstrong or not: \n");
    scanf("%d", &n);
    //counting number of digits;
    temp=n;
    while (temp!=0)
    {
        temp/=10;
        digit++;
    }
    temp=n;
    while (temp!=0)
    {
        remainder= temp%10;
        result+= round(pow(remainder, digit));
        temp/=10;
    }
    if(n==result){
        printf("%d is Armstrong\n", n);
    }
    else{
        printf("%d is not Armstrong as sum of digits is: %d", n, result);
    }
    
    

    return 0;
}
