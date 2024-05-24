package HashMApAdres;

import java.util.Objects;

public class Address {
    private  String street;
    private  int buildNumber;
    private  int flatNumber;

    public Address(String street, int buildNumber, int flatNumber) {
        this.street = street;
        this.buildNumber = buildNumber;
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return
                "Улица= " + street  +
                ", Номер дома= " + " " + buildNumber +
                ", Номер квартиры= " + flatNumber + " ";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Address address = (Address) object;
        return buildNumber == address.buildNumber && flatNumber == address.flatNumber && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, buildNumber, flatNumber);
    }
}
