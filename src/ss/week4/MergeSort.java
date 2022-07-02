package ss.week4;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static <E extends Comparable<E>> void mergesort(List<E> list) {
        if(list.size() == 1 || list.isEmpty()) {
          return;
        }
    	int mid = list.size() / 2;
        List<E> left = new ArrayList<E>();
        List<E> right = new ArrayList<E>();
        for (int i = 0; i < mid; i++) {
            left.add(list.get(i));
        }
        for (int i = mid; i < list.size(); i++) {
            right.add(list.get(i));
        }
        mergesort(left);
        mergesort(right);
        List<E> fin = new ArrayList<E>();
        var i = 0;
        var j = 0;
        while (true) {
            if(right.get(j).compareTo(left.get(i)) >= 0) {
                fin.add(left.get(i));
                i++;
            } else {
                fin.add(right.get(j));
                j++;
            }
            if (i == left.size()){
                fin.addAll(right.subList(j, right.size()));
                break;
            } else if (j == right.size()) {
                fin.addAll(left.subList(i, left.size()));
                break;
            }
        }

        for (int k = 0; k < list.size(); k++) {
            list.set(k, fin.get(k));
        };
    }
}
