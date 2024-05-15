package Collections_List.List_of;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 1, 2, 3, 2, 5, 5, 4, 4, 7, 6, 7));
        List<Integer> resultList = new ArrayList<>();
        for (Integer i : list) {
            if (!resultList.contains(i)) {
                resultList.add(i);
            }
        }
        System.out.println(resultList);

        Collections.sort(resultList);
        System.out.println(list);


        Set<Integer> set = new  HashSet <>(list);
        list.clear();
        list.addAll(set);

        System.out.println(list);
    }
}

