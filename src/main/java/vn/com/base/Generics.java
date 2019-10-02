package vn.com.base;

public class Generics {
    public static void main(String[] args) {
        KeyValue<Integer, String> entry = new KeyValue<>(123, "TOM");
        Integer key = entry.getKey();
        String name = entry.getValue();
        System.out.println(key + "_" + name);

        StringAndValueEntry<String> entry2 = new StringAndValueEntry<>("22", "TOMMY");
        System.out.println(entry2.getKey() + "_" + entry2.getValue());

        GenericInterface<KeyValue> gti = new GenericInterfaceImpl<>();

        KeyValue keyValue = new KeyValue<>("A", "B");
        KeyValue keyValue1 = gti.doSomething(keyValue);
        System.out.println(keyValue1.getKey() + "_" + keyValue1.getValue());
    }
}

class KeyValue<K, V> {
    private K key;
    private V value;

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

class StringAndValueEntry<V> extends KeyValue<String, V> {
    public StringAndValueEntry(String key, V value) {
        super(key, value);
    }
}

interface GenericInterface<G> {
    public G doSomething(G g);
}

class GenericInterfaceImpl<G> implements GenericInterface<G> {

    private G something;

    @Override
    public G doSomething(G g) {
        return g;
    }
}