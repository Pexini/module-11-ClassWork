package Collections_List;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {

        // Сортировка  и удаление дубликатов
        String strNumbers = "1, 2, 2, 4, 5, 5, 6, 1, 4, 6, 7, 3, 3, 9, 8";
        String[] numbers = strNumbers.split(", ");
        Set<Integer> setNumbers = new HashSet<>();


        for (String number : numbers) {
            setNumbers.add(Integer.parseInt(number));
        }
        System.out.println(setNumbers);


        // Объединение, сортировка и удаление дубликатов
        List<Integer> first = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 8);
        List<Integer> second = Arrays.asList(2, 3, 4, 6, 9, 3, 2, 1, 5, 8);
        Set<Integer> common = new HashSet<>(first);
        common.retainAll(second);

        System.out.println(common);


        // Сортировка списков по алфавиту, удаление дубликатов
        String[] arr = {"programming" , "array", "deal", "deal", "meat", "french", "meat", "cinema", "awesome", "is"};
        List<String> list = Arrays.asList(arr);
        TreeSet<String> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);



    }
}
