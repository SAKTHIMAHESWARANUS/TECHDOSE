int mySqrt(int x){
        long long ctr=0;
        while(ctr*ctr <= x){
            ctr++;
        }
    return ctr-1;
}
