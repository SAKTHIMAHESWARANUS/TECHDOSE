int checkDistances(char * str, int* distance, int distanceSize){
    int len=strlen(str);
    for(int i=0;i<len;i++){
        for(int j=i+1;j<len;j++){
            if(str[i]==str[j]){
                int d=(j-i)-1;
                int val=str[i];
                int g=val-97;
                if(distance[g]!=d){
                    return false;
                }
            }
        }
    }
    return true;
    
}
