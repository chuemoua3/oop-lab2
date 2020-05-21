import java.util.Collection;

public class OverdueList<T> {
    // T is generic type
    // it is a generic class or interface that is parametized over types
    private Collection<T> overdueList;

    public OverdueList(Collection<T> overdueList) {
        this.overdueList = overdueList;
    }

    public Collection<T> getOverdueList() {
        return overdueList;
    }

    public void setOverdueList(Collection<T> overdueList) {
        this.overdueList = overdueList;
    }
}