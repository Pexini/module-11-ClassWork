package AbstrHuman;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("01.01.1990", "Воснецов Семен Семеныч");
        Human human2 = new Human("02.02.2000", "Сизоцов Петр Олегович");

        String toStringResult = human1.toString();
        System.out.println("toStringResult = " + toStringResult);
        System.out.println(human2);

        boolean equalsResult = human1.equals(human2);
        System.out.println("equalsResult " + equalsResult);

        int hashCodeResult = human1.hashCode();
        System.out.println("hashCodeResult" + hashCodeResult);


        Human human3 = new Human("01.01.1990", "Воснецов Семен Семеныч");
        Human human4 = new Human("01.01.1990", "Воснецов Семен Семеныч");
        Human human5 = human3;

        System.out.println(human3.equals(human4));
        System.out.println(human5.equals(human3));

        Human human7 = new Human("01.01.1990", "Воснецов Семен Семеныч");
        Human human8 = new Human("01.01.1990", "Воснецов Семен Семеныч");

        HashSet set = new HashSet();
        set.add(human7);
        set.add(human8);

        System.out.println(set);
    }
}
