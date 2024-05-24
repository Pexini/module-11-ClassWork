package HasHMapTreeSet;

import java.util.Objects;

public class Address implements Comparable<Address> {
    private String srtreet;
    private int NumberOfBuild;
    private int NumberOfFlat;
    private int index;

    public Address(String srtreet, int numberOfBuild, int numberOfFlat, int index) {
        this.srtreet = srtreet;
        NumberOfBuild = numberOfBuild;
        NumberOfFlat = numberOfFlat;
        this.index = index;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Address address = (Address) object;
        return NumberOfBuild == address.NumberOfBuild && NumberOfFlat == address.NumberOfFlat && index == address.index && Objects.equals(srtreet, address.srtreet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srtreet, NumberOfBuild, NumberOfFlat, index);
    }

    @Override
    public String toString() {
        return "Address: " +
                "Улица='" + srtreet + '\'' +
                ", Номер дома=" + NumberOfBuild +
                ", Номер квартиры =" + NumberOfFlat +
                ", Индекс =" + index +
                '}';
    }

    @Override
    public int compareTo(Address o) {
        int commparingStreet = this.srtreet.compareTo(o.srtreet);
        if (commparingStreet == 0) {
            int comparingBuild = this.NumberOfBuild - o.NumberOfBuild;
            if (comparingBuild == 0) {
                int comparingFlat = this.NumberOfFlat - o.NumberOfFlat;
                if (comparingFlat == 0) {
                    return this.index - o.index;
                } else {
                    return comparingBuild;
                }
            } else {
                return commparingStreet;
            }
        }else {
            return commparingStreet;
        }
    }
}