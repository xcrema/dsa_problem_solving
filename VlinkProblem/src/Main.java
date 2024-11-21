import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    static AtomicInteger temp = new AtomicInteger(1);

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        Thread thread1 = new Thread(() -> {
//            while(temp.get() <= n) {
//                if (temp.get()%2 == 0) {
//                    System.out.println(temp.getAndAdd(1));
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            while(temp.get() <= n) {
//                if (temp.get()%2 != 0) {
//                    System.out.println(temp.getAndAdd(1));
//                }
//            }
//        });
//
//        thread1.start();
//        thread2.start();

        int[] arr = {1, 2, 3, 4, 2, 3, 1, 8, 6};
        System.out.println(Arrays.stream(arr).boxed().filter(data -> data%2 == 0).collect(Collectors.toSet()));

        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity())));

    }
}