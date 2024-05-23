package Collections_List.Applecolor2;

public class Main {
    public static void main(String[] args) {
        Apple greenApple = new Apple("green");
        System.out.println("green apple " + greenApple.hashCode());

        Apple greenApple1 = new Apple("green");
        System.out.println("green apple1 " + greenApple1.hashCode());

        System.out.println(greenApple.equals(greenApple1));

        System.out.println("---------------------------------------");

        Apple redApple = new Apple("red");
        System.out.println("red apple " + redApple.hashCode());
        Apple greenApple3 = new Apple("green");
        System.out.println("green apple1 " + greenApple3.hashCode());

        System.out.println(greenApple.equals(redApple));

    }
}
