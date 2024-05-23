package Collections_List.HashAndTree;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "My name";
        String s3 = "is Victor";
        String s4 = "i'm engineer";

        Set<String> hashSet = new HashSet<>();
        SortedSet<String> treeSet = new TreeSet<>();

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);


        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);

        System.out.println("HashSet " + hashSet);
        System.out.println("TreeSet " + treeSet);

    }
}
