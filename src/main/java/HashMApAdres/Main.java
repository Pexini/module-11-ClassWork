package HashMApAdres;

import HashMapHouse.House;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       House house1 = new House(541, 5);
       House house2 = new House(125, 3);

        Address address1 = new Address("Cherry", 15, 5);
        Address address2 = new Address("Tomato", 5, 53);

        Map<Address,House> map = new HashMap<>();

        map.put(address1, house1);
        map.put(address2, house2);
        System.out.println(map);


    }
}
