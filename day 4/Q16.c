// Write a program to Print Armstrong numbers
// in a range.
#include<stdio.h>
#include<math.h>
int main(){
    int temp, digits, remainder, result, a, b;
    printf("Enter the range in which you want to print Armstrong number: \n");
    scanf("%d%d", &a,&b);
    for (int i = a; i <=b; i++)
    {
        //counting number of digits
        temp=i;
        digits=0;
        while (temp!=0)
        {
            temp/=10;
            digits++;
        }
        result=0;
        temp=i;
        while(temp!=0)
        {
          remainder= temp%10;
          result+= round(pow(remainder, digits));
          temp/=10;
        }
        if(i==result)
        {
            printf("%d\n", i);
        }
        
    }
    
    return 0;
}
