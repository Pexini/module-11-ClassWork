package Collections_List.WindowsCompany;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        WindowsTemplate template1 = new WindowsTemplate(15, 25);
        WindowsTemplate template2 = new WindowsTemplate(5, 125);
        WindowsTemplate template3 = new WindowsTemplate(115, 225);
        WindowsTemplate template4 = new WindowsTemplate(7, 125);

        TreeSet<WindowsTemplate> treeSet = new TreeSet<>();
        treeSet.add(template1);
        treeSet.add(template2);
        treeSet.add(template3);
        treeSet.add(template4);

        System.out.println(treeSet);

    }
}
