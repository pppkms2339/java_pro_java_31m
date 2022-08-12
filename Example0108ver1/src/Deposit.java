public abstract class Deposit {

    private String holderName;
    private double depositAmount;

    public Deposit(String holderName, double depositAmount) {
        this.holderName = holderName;
        this.depositAmount = depositAmount;
    }

    public abstract double calculateDepositAmount(int months);

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }
}
