package Collections_List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + i;
        }
        System.out.println("Массив длиной: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(12);

        for (Integer i : list) {

            System.out.println(i);
        }
        System.out.println();
        list.remove(2);
        for (Integer i : list)
            System.out.println(i);
    }
}
