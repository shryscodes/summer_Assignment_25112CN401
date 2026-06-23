// Write a program to Find string length
// without strlen().
#include<stdio.h>
int main(){
    char str[100];
    scanf("%s", str);

    int i = 0;
    while(str[i] != '\0'){
        i++;
    }

    printf("Length of the string %s: %d\n", str, i);
    return 0;
}
