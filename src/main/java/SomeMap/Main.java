package SomeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Cat, Long> cats = new HashMap<>();
        cats.put(new Cat("Васек", 10), 1_154_124_222L);
        cats.put(new Cat("Мурзик", 12), 1_333_624_277L);
        cats.put(new Cat("Помпушка", 2), 1_454_178_452L);
        cats.put(new Cat("Мамушка", 4), 1_156_165_454L);

        List<Cat> listOfCat = new ArrayList<>();


        for (var cat : cats.entrySet()) {
            if (cat.getKey().getName().startsWith("М")) {
                System.out.println(cat.getValue());

            } else {
                listOfCat.add(cat.getKey());
            }
        }

        for (var l : listOfCat) {
            cats.remove(l);

        }
        System.out.println(cats);
    }

}
