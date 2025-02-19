package OOP.Encapsulation;

public class Account {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount) {
        if (amount > 0)
            this.balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0)
            this.balance -= amount;
    }

}