public abstract class Deposit {

    private String holderName;
    private double depositAmount;
    private Branch branch;

    public Deposit(Branch branch, String holderName, double depositAmount) {
        this.branch = branch;
        // Сумму этого вклада добавим к общей сумме всех вкладов филиала
        branch.setTotalDeposit(branch.getTotalDeposit() + depositAmount);
        this.holderName = holderName;
        this.depositAmount = depositAmount;
    }

    public abstract double calculateDepositAmount(int months);

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

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
