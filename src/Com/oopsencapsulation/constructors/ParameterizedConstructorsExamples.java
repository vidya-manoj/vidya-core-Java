package Com.oopsencapsulation.constructors;


class BankAccount {

    private int accountNumber;
    private double balance;
    private String accountHolderName;

    //Parameterized Constructors

    public BankAccount(int acNum, double bal, String accHN) {
        this.accountNumber = acNum;
        this.balance = bal;
        this.accountHolderName = accHN;

    }

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    public void display() {
        System.out.println("Account Number:: "+ accountNumber + "Balance:: "+ balance + "AccountHolderName:: "+ accountHolderName);
    }




}
public class ParameterizedConstructorsExamples {

    public static void main(String[] args) {
        BankAccount hdfcBankAccount = new BankAccount(11 , 1001 , "Vidya" );
        BankAccount iciciAccount = new BankAccount(5, 800, "");
        BankAccount boaAccount = new BankAccount(14);

        hdfcBankAccount.display();
        iciciAccount.display();
        boaAccount.display();


    }
}
