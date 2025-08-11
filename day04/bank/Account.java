package bank;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        setName(name);
        if (balance <= 0.0)
            throw new IllegalArgumentException("O saldo não pode ser negativo!");
        this.balance = balance;

    }

    public void deposit(double amount) {
        if (amount <= 0.0)
            throw new IllegalArgumentException("O valor não pode ser negativo!");
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("O nome não pode ser null!");
        if (name.isBlank())
            throw new IllegalArgumentException("O nome deve conter letras");

        this.name = name;
    }

    public String getName() {
        return name;
    }
}