package hashtable;

public class Entry<T> {
    Integer key;
    T value;
    Entry next;

    public Entry(){
        next = null;
    }

    public Entry(Integer key, T value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public Integer getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}
