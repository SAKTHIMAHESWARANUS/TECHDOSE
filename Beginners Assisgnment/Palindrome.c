#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char str[101];
    scanf("%s",str);
    int len=strlen(str);
    int flag=0;
    int left=0;
    int right=len-1;
    while(left<=right){
        if(str[left]!=str[right]){
            flag=1;
            break;
        }
        left++;
        right--;
    }
    if(flag==1){
        printf("Not Palindrome");
    }
    else{
        printf("Palindrome");
    }
    return 0;
}
