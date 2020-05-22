public class GeneralBook extends Book implements Loanable{

    public GeneralBook(String titles, Authors authors, int bookTotal, String genre, int pages) {
        super(titles, authors, pages, bookTotal, genre);
    }

    @Override
    public boolean isLoanable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public double loanFee() {
        // TODO Auto-generated method stub
        return 2.00;
    }

    @Override
    public ChargeSchedule feeSchedule() {
        // TODO Auto-generated method stub
        return ChargeSchedule.WEEKLY;
    }
}