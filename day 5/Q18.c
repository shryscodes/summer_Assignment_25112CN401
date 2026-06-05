    // Write a program to Check strong number.
    #include<stdio.h>
    int fact(int number){
        int fact=1;
        for (int i = 1; i <= number; i++)
        {
            fact*=i;
        }
        return fact;
        
    }
    int main(){
        int n, temp, sum=0, remainder;
        printf("Enter the number you want to check is strong or not: \n");
        scanf("%d", &n);
        temp=n;
        while (temp!=0)
        {
            remainder=temp%10;
            temp/=10;
            sum+= fact(remainder);

        }
        if(n==sum)
        printf("%d is a strong number\n", n);
        else
        printf("%d is not a strong number as the sum of factorial of digits is: %d\n", n, sum);
        

        return 0;
    }
