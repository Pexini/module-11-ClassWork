package Collections_List.WindowsCompany;

public class WindowsTemplate implements  Comparable <WindowsTemplate>{
    private int a;
    private int b;

    public WindowsTemplate(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSquare() {
        return a * b;
    }
    public int compareTo (WindowsTemplate o){
        return getSquare() - o.getSquare();
    }

    public String toString(){
        return "a:" + a + " b:" + b;
    }

}
