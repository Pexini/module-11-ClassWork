package HashMapHouse;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(1245, 35);
        House house2 = new House(145, 3);
        House house3 = new House(12434, 335);
        House house4 = new House(1225, 37);

        Map<String, House> houseMap = new HashMap<>();

        houseMap.put("Горького 61", house1);
        houseMap.put("Горького 61", house2);
        houseMap.put("Горького 61", house3);
        houseMap.put("Горького 61", house4);
        houseMap.put("Максимова 31", house3);
//        houseMap.put("Арбузова 45", house3);
//        houseMap.put("Вишневского 6", house4);

//        System.out.println(houseMap );
        System.out.println(houseMap.keySet());
        System.out.println(house2.equals(house1));
        System.out.println(houseMap.values());
    }
}
