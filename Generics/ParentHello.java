
class ParentHello<K,V,I> extends Dictionary<K,V> {
    private I info;
    public ParentHello(K key, V value){
        super(key , value);
    }
    public ParentHello(K key, V value, I info){
        super(key,value);
        this.info = info;
    }
    public I getInfo(){
        return info;
    }
    public void setInfo(I info) {
        this.info = info;
    }
}
