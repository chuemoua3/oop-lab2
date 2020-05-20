public class CardHolder {

    private String name;
    private int age;
    private boolean checkOut, reserve, overDue;

    public CardHolder(String name, int age, boolean checkOut, boolean reserve, boolean overDue) {
        this.name = name;
        this.age = age;
        this.checkOut = checkOut;
        this.reserve = reserve;
        this.overDue = overDue;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getCheckOut() {
        return checkOut;
    }

    public boolean getReserve() {
        return reserve;
    }

    public boolean getOverDue() {
        return overDue;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public void setOverDue(boolean overDue) {
        this.overDue = overDue;
    }
}