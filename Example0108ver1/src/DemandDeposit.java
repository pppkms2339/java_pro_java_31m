public class DemandDeposit extends Deposit {

    public DemandDeposit(Branch branch, String holderName, double depositAmount) {
        super(branch, holderName, depositAmount);
    }

    @Override
    public double calculateDepositAmount(int months) {
        return getDepositAmount() * (1 + 0.06 * months / 12);
    }

}
