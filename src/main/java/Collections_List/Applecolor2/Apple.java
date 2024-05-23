package Collections_List.Applecolor2;
import java.util.Objects;

public class Apple {
    private String color;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Apple apple = (Apple) obj;
        return Objects.equals(color, apple.color);

    }
    public int hashCode(){
        return Objects.hash(color);
    }
}
