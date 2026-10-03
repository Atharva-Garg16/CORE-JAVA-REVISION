// 1. Define the custom exception
 class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

 class BankAccount {
    private double balance = 500.00;

    // 2. Throw the exception based on a condition
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed! You lack standard funds.");
        }
        balance -= amount;
        System.out.println("Successfully withdrew: $" + amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // 3. Catch the exception using a try-catch block
        try {
            account.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.err.println("Error Caught: " + e.getMessage());
        }
    }
}
