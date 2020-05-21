import java.util.List;
public class CardHolder {

    private String name;
    private int age;
    private boolean checkOut, reserve; //overDue;
    private List<Book> overdueBooks;
    private List<Periodical> overduePeriodicals;

    public CardHolder(String name, int age, boolean checkOut, boolean reserve) {
        this.name = name;
        this.age = age;
        this.checkOut = checkOut;
        this.reserve = reserve;
        // this.overDue = overDue;
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

    // public boolean getOverDue() {
    //     return overDue;
    // }
    public List <Book> getOverdueBooks(){
        return overdueBooks;
    }
    public List<Periodical> getOverduePeriodicals(){
        return overduePeriodicals;
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

    // public void setOverDue(boolean overDue) {
    //     this.overDue = overDue;
    // }
    public void setOverdueBooks(List<Book> overdueBooks){
        this.overdueBooks = overdueBooks;
    }

    public void setOverduePeriodicals(List<Periodical> overduePeriodicals){
        this.overduePeriodicals = overduePeriodicals;
    }

    public void addOverdueBooks(Book book){
        overdueBooks.add(book);
    }
    
    public void addOverduePeriodicals(Periodical periodical){
        overduePeriodicals.add(periodical);
    }
}