package ss.week4;

public class ArrayExercises {


    public static int countNegativeNumbers(int[] arr) {
        int result = 0;
        for(int i : arr){
            if(i < 0){
                result++;
            }
        }
        System.out.println(result);
        return result;

    }

    public static void reverseArray(int[] ints) {
        int front;
        int back;
        for(int i = 0; i < ints.length/2; i++){
            front = ints[i];
            back = ints[ints.length - (i + 1)];
            ints[i] = back;
            ints[ints.length - (i + 1)] = front;
        }
        System.out.println(ints);

    }

    class SimpleList {
        public class Element {}

        public class Node {
            public Node next;
            public Element element;
        }

        private Node first;

        private Node find(Element element) {
            Node p = first;
            if (p == null) {
                return null;
            }
            while (p.next != null && !p.next.element.equals(element)) {
                p = p.next;
            }
            if (p.next == null) {
                return null;
            } else {
                return p;
            }
        }

        public void remove(Element element) {
            Node p = find(element);
            if (p != null) {
                p.next = p.next.next;
            }
        }
    }
}
