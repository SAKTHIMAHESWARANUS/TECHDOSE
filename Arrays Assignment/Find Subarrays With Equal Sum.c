bool findSubarrays(int* arr, int n){
    int ctr[n],k=0;
    for(int i=0;i<n-1;i++){
        ctr[k++]=(arr[i]+arr[i+1]);
    }
    int p=0;
    for(int i=0;i<k;i++){
        for(int j=i+1;j<k;j++){
           if(ctr[i]==ctr[j]){
            p=1;
          }
        }
    }
        if(p==1){
           return true;
        }
        else{
            return false;
        }

}
