package Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Barsik", 5);

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
        System.out.println("Hash code cat1" + cat1.hashCode());
        System.out.println("Hash code cat2" + cat2.hashCode());
    }
}
