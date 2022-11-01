class MyHashMap {
    int arr[];
    boolean ctr[];

    public MyHashMap() {
        this.arr=new int[1000001];
        this.ctr=new boolean[1000001];
    }
    
    public void put(int key, int value) {
        if(!ctr[key]){
            ctr[key]=true;
        }
        arr[key]=value;
    }
    
    public int get(int key) {
        if(ctr[key]==false) return -1;
        return arr[key];
    }
    
    public void remove(int key) {
        ctr[key]=false;
    }
}
