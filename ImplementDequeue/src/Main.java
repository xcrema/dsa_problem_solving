class MyCircularDeque {

    int[] arr;
    int start;
    int end;
    int size;

    public MyCircularDeque(int k) {
        this.arr = new int[k];
        this.start = -1;
        this.end = 0;
        this.size = 0;
    }

    public boolean insertFront(int value) {
        if (size == 0) {
            start = -1;
            end = 0;
            arr[++start] = value;
            size++;
            return true;
        }
        if (start+1 >= arr.length) {
            start = -1;
        }
        if (start+1 == end) {
            return false;
        }
        arr[++start] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (size == 0) {
            end = 0;
            start = -1;
            arr[end] = value;
            start++;
            size++;
            return true;
        }
        if (end-1 < 0) {
            end = arr.length;
        }
        if (end-1 == start) {
            return false;
        }
        arr[--end] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (size == 0) {
            return false;
        }
        start--;
        if (start<0) {
            start = arr.length-1;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size == 0) {
            return false;
        }
        end++;
        if (end >= arr.length) {
            end = 0;
        }
        size--;
        return true;
    }

    public int getFront() {
        if (size == 0) {
            return -1;
        }
        return arr[start];
    }

    public int getRear() {
        if (size == 0) {
            return -1;
        }
        return arr[end];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }
}

public class Main {
    public static void main(String[] args) {
        MyCircularDeque deque = new MyCircularDeque(3);

        System.out.println(deque.insertLast(1));
        System.out.println(deque.insertLast(2));
        System.out.println(deque.insertFront(3));
        System.out.println(deque.insertFront(4));
        System.out.println(deque.getRear());
        System.out.println(deque.isFull());
        System.out.println(deque.deleteLast());
        System.out.println(deque.insertFront(4));
        System.out.println(deque.getFront());
    }
}