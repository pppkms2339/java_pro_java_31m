public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of Germany");

        Branch branch = new Branch(bank, "Berlin branch");

        LongTermDeposit ltd1 = new LongTermDeposit(branch, "John", 5000.0);
        LongTermDeposit ltd2 = new LongTermDeposit(branch, "Ann", 1000.0);
        LongTermDeposit ltd3 = new LongTermDeposit(branch, "Victor", 15000.0);
        DemandDeposit dd1 = new DemandDeposit(branch, "John", 3500.0);
        DemandDeposit dd2 = new DemandDeposit(branch,"Ann", 7500.0);

        // Выведем общую сумму всех вкладов в филиале
        System.out.println(branch.getTotalDeposit());

        Deposit[] deposits = {ltd1, ltd2, ltd3, dd1, dd2};

        for (Deposit deposit : deposits) {
            System.out.println(deposit.getHolderName() + " " + deposit.getDepositAmount() + " " + deposit.calculateDepositAmount(3));
        }

    }

}
