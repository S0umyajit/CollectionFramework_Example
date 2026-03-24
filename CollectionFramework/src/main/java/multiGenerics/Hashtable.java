package multiGenerics;

public class Hashtable <K,V> {

    private K key;
    private V value;

    public Hashtable(K key,V value){
        this.key=key;
        this.value=value;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V value){
        this.value=value;
    }

    public String toString(){
        return key + " - "+ value;
    }
}
