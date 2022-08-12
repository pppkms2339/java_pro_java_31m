public class Branch {

    private String name;
    private double totalDeposit;

    public Branch(String name, double totalDeposit) {
        this.name = name;
        this.totalDeposit = totalDeposit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalDeposit() {
        return totalDeposit;
    }

    public void setTotalDeposit(double totalDeposit) {
        this.totalDeposit = totalDeposit;
    }
}
