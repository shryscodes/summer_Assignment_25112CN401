// Write a program to Convert binary to decimal.
#include<stdio.h>
int main(){
    long long bin;
    int dec=0, power=1, remainder;
    printf("Enter the number in Binary: \n");
    scanf("%lld", &bin);
    long long temp= bin;
    while (bin!=0)
    {
      remainder= bin%10;
      dec+= remainder*power;
      bin/=10;
      power*=2;
    }
    printf("%lld in decimal: %d", temp, dec);
    
    return 0;
}
