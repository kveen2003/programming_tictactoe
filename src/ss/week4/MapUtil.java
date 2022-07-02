package ss.week4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapUtil {
    public static <K, V> boolean isOneOnOne(Map<K, V> map) {
        int size = 0;
        Set<V> newSet = new HashSet<V>();
        for(K key : map.keySet()){
            newSet.add(map.get(key));
            size++;
        }
        return newSet.size() == size;
    }
    
    public static <K, V> boolean isSurjectiveOnRange(Map<K, V> map, Set<V> range) {
        int n = 0;
        for(V value : range){
            for(K key: map.keySet()){
                if(map.get(key) == value){
                    break;
                }
                n++;
                if(n == map.keySet().size()){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static <K, V> Map<V, Set<K>> inverse(Map<K, V> map) {
        Map<V, Set<K>> result = new HashMap<>();
        for (K key : map.keySet()) {
            V value = map.get(key);
            Set<K> temp = new HashSet<>();
            temp.add(key);
            if(!(result.get(value) == null)){
                result.get(value).add(key);
            }
            else {
                result.put(value, temp);
            }
        }
        return result;
    }
    
    public static <K, V> Map<V, K> inverseBijection(Map<K, V> map) {
        Map<V, K> result = new HashMap<>();
        for (K key : map.keySet()) {
            result.put(map.get(key), key);
        }
        return result;
    }
	
    public static <K, V, W> boolean compatible(Map<K, V> f, Map<V, W> g) {
        return false;
    }
	
    public static <K, V, W> Map<K, W> compose(Map<K, V> f, Map<V, W> g) {
        return null;
    }
	
}
