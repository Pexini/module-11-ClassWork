package AbstrHuman;

public class Human {
    private String birthday;
    private String fio;

    public Human(String birthday, String fio) {
        this.birthday = birthday;
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "FIO-" + fio + " Birthday-" + birthday;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Human humanObj = (Human) object;
        boolean result = fio.equals(humanObj.fio)
                && birthday.equals(humanObj.birthday);
        return result;
    }

    @Override
    public int hashCode(){
        return fio.hashCode() + birthday.hashCode();
    }

}
