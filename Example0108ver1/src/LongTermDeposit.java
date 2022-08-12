public class LongTermDeposit extends Deposit {

    public LongTermDeposit(String holderName, double depositAmount) {
        super(holderName, depositAmount);
    }

    @Override
    public double calculateDepositAmount(int months) {
        if (getDepositAmount() < 10000) {
            return getDepositAmount() * (1 + 0.12 * months / 12);
        } else {
            return getDepositAmount() * (1 + 0.18 * months / 12);
        }
    }

}
