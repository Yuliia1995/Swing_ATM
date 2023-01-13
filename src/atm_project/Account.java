package atm_project;

public class Account {
    private double balance;
    public Account(double bal) {
        this.balance = bal;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String withdraw(double amount) {
        if (this.balance>amount) {
            this.balance -=amount;
            return "The receipt of withdrawal of $"+String.format("%,.2f", amount)+" will be emailed to you.";
        } else {
            return "Insufficient Funds.\nThe amount of withdrawal of $"+String.format("%,.2f", amount)+" exceeds your current balance.";
        }
    }
    public String deposit(double amount) {
        this.balance += amount;
        return "The amount of $"+String.format("%,.2f", amount)+" was deposited to your account";
    }
}
