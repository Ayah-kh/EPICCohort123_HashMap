import java.util.LinkedList;
import java.util.List;

public class MyHashMap<K, V> {
    List<V> list = new LinkedList<>();
    private LinkedList<V>[] array;


    public MyHashMap() {
        this.array = new LinkedList[10];
    }

    public void add(Integer key, V value) {
        int storeIndex = key / 1000;
        if (array[storeIndex] == null)
            array[storeIndex] = new LinkedList<>();

        array[storeIndex].add(value);
        System.out.println("storeIndex: "+storeIndex+": "+ array[storeIndex]);
    }

    public V remove(Integer key){
        int storeIndex = key / 1000;
        return array[storeIndex].remove();
    }






    public void test() {

    }
}
