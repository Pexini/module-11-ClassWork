package Collections_List.AppleColor;

import static java.awt.Color.green;

public class Main {
    public static void main(String[] args) {
        Apple greenApple = new Apple("Green");
        System.out.println(greenApple.hashCode());

        Apple greenApple1 = new Apple("Green");
        System.out.println(greenApple1.hashCode());

        System.out.println(greenApple1.equals(greenApple1));
    }
}
