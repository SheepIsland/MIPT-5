package mipt.sbt;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Violetta on 11/10/2018.
 */
public class CountMapIml<E> implements CountMap<E>{

    private Map<E, Integer> map;

    public CountMapIml() {
        this.map = new HashMap<>();
    }

    @Override
    public void add(E element) {
       map.put(element,  map.containsKey(element) ? map.get(element) + 1 : 1);
    }

    @Override
    public int getCount(E element) {
        Integer count = map.get(element);
        if (count != null)
            return count;
        return 0;
    }

    @Override
    public int remove(E element) {
        Integer count = map.remove(element);
        if (count != null)
            return count;
        return 0;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<? extends E> source) {
        for (Map.Entry<? extends E, Integer> entry : source.toMap().entrySet()) {
            Integer count = entry.getValue();
            map.put(entry.getKey(), map.containsKey(entry) ? map.get(entry) + count: count);
        }
    }

    @Override
    public Map<E, Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map<? super E, Integer> destination) {
        destination.putAll(map);
    }

    @Override
    public String toString() {
        return "CountMapIml{" +
                "map=" + map +
                '}';
    }
}
