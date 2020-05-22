public interface Loanable {
    boolean isLoanable();
    double loanFee();
    ChargeSchedule feeSchedule();
}