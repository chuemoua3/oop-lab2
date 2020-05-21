
public class PublishingCompany {

    private String compName;
    private int numCust, numEmp;

    public PublishingCompany(String compName, int numCust, int numEmp) {
        this.compName = compName;
        this.numCust = numCust;
        this.numEmp = numEmp;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public int getNumCust() {
        return numCust;
    }

    public void setNumCust(int numCust) {
        this.numCust = numCust;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

}