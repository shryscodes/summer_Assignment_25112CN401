// Write a program to Count set bits in a number.
#include <stdio.h>
int main()
{
    int num, count = 0, temp;
    printf("Enter a number: \n");
    scanf("%d", &num);
    temp = num;
    if (num == 0)
    {
        printf("Set bits in %d: 0", num);
        return 0;
    }
    while (temp != 0)
    {
        if (temp % 2 == 1)
        {
            count++;
        }
        temp /= 2;
    }
    printf("Set bits in %d: %d", num, count);
    return 0;
}
