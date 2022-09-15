#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
 char str[101];
    scanf("%s",str);
    int alpha [127]={0};
    int len=strlen(str);
    for(int i=0;i<len;i++){
      alpha[str[i]]++;
    }
    for(int i=0;i<127;i++){
      if(alpha[i]>0){
        printf("%c-%d\n",(char)i,alpha[i]);
      }
    }
}
