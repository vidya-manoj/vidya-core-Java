package Com.oopsencapsulation;

public class BankAccount {

    public double getBalance() {
        return balance;
    }

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance <= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial Balance Should Not Be Negative.");
        }
    }


    //Deposit
    public void deposit(double amount) {
        //Login
        //Authentication
        //Authorization
        if (amount > 0) {
            balance += amount;  //balance = balance + amount
            System.out.println("Deposited: "+ amount);
        } else {
            System.out.println("Deposit amount should be positive ");

        }
    }



    //Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            balance -= amount;
            System.out.println("Withdraw success for : "+ amount);
        }else {
            System.out.println("Invalid withdrawal amount or insufficient funds ");
        }

    }
}


class Runner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        account.deposit(1000);
        account.deposit(700);

        account.withdraw(9000);
        account.withdraw(900);


        System.out.println("current Balance: "+ account.getBalance());

    }
}