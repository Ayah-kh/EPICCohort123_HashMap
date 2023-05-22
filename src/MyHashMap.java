import java.util.LinkedList;
import java.util.List;

public class MyHashMap<K,V> {
    private LinkedList<V>[] array;


    List<V> list=new LinkedList<>();


    public MyHashMap() {
        this.array = new LinkedList[10];
    }

    public void add(K k,V v){
        array[0].add(v);
        System.out.println(array[0]);
    }



    public void test(){

    }
}
