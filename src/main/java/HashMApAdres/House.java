package HashMApAdres;

public class House {
    private int squer;
    private int numberOfPeople;

    public House(int squer, int numberOfPeople) {
        this.squer = squer;
        this.numberOfPeople = numberOfPeople;
    }


    @Override
    public String toString() {
        return
                "Площадь =" + squer  +
                "Колличество жильцов =" + numberOfPeople
                ;
    }
}
