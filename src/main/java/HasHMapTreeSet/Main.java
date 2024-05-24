package HasHMapTreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("ул. Вишневая", 15, 52, 245633);
        Address address2 = new Address("ул. Садовая", 125, 32, 420157);
        Address address3 = new Address("ул. Бодяная", 14, 35, 324859);

        House house1 = new House(12_456, 1_247);
        House house2 = new House(1_456, 847);
        House house3 = new House(1456, 147);

        Map<Address, House> map = new TreeMap<>();
        map.put(address1, house1);
        map.put(address2, house2);
        map.put(address3, house3);

        System.out.println(map);

    }
}
