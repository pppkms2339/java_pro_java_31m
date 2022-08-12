public class DemandDeposit extends Deposit {

    public DemandDeposit(String holderName, double depositAmount) {
        super(holderName, depositAmount);
    }

    @Override
    public double calculateDepositAmount(int months) {
        return getDepositAmount() * (1 + 0.06 * months / 12);
    }

}
