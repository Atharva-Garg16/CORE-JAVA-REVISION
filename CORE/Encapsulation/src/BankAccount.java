public class BankAccount {
    private String AccountNumber;
    private double balance;
    private String AccountHolderName;

    public double getBalance() {
        return balance;
    }
    public void withdraw(double balance) {
       if (this.balance <= balance) {
           System.out.print("Insufficient funds to make transaction\n");
       }
       else  {
           this.balance -= balance;
       }
    }
    public void deposit(double money) {
        if (money<=0){
            System.out.println("Invalid transaction\n");
        }
        else {
            this.balance += money;
        }
    }
}
class BankUser{
    static void main() {
        BankAccount b1 = new BankAccount();
        System.out.println("current balence= "+b1.getBalance());
        b1.withdraw(500);
        System.out.println("current balence= "+b1.getBalance());
        b1.deposit(500);
        System.out.println("current balence= "+b1.getBalance());
        b1.withdraw(200);
        System.out.println("current balence= "+b1.getBalance());
    }
}
