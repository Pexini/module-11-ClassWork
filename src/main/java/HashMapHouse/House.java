package HashMapHouse;

import java.util.Objects;

public class House {
    private  int square;
    private  int numberOfPeople;

    public House(int square, int numberOfPeople) {
        this.square = square;
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return
                "Площадь дома =" + square +
                ", Колличество жильцов =" + numberOfPeople;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        House house = (House) object;
        return square == house.square && numberOfPeople == house.numberOfPeople;
    }

    @Override
    public int hashCode() {
        return Objects.hash(square, numberOfPeople);
    }
}
