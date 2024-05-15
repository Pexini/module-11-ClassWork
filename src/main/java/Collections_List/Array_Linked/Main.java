package Collections_List.Array_Linked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s1 = "Word 1";
        String s2 = "Word 2";
        String s3 = "Word 3";

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add(s1);
        arrayList.add(s3);
        linkedList.add(s2);


        System.out.println("ArrayList " + arrayList);
        System.out.println("LinkedList " + linkedList);

        System.out.println("ArrayList длина " + arrayList.size());
        System.out.println("LinkedList длина " + linkedList.size());

        arrayList.add(1,"Строка по середине");
        arrayList.add(0,"Строка #1");

        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

    }
}
