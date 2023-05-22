import java.util.LinkedList;
import java.util.List;

public class MyHashMap<K,V> {
    private LinkedList<V>[] array;


    List<V> list=new LinkedList<>();


    public MyHashMap() {
        this.array = new LinkedList[10];
    }

    public void add(Integer k,V v){
        int hashCode = Integer.valueOf(k).hashCode();
        array[0]=new LinkedList<>();
        array[0].add(v);
        System.out.println(array[0]);
    }



    public void test(){

    }
}
