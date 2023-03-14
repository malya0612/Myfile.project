package objects;

public class BankAccount {
    String accountNumber; // exactly 8 digits
    String accountHolderName;
    double balance;
    double dailyWithdrawLimit = 5000;
    double dailyWithdrawedAmount;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Info: " + accountHolderName + "successfully deposited" + amount + "$");

    }


    public boolean withdraw(double amount) {
        if (balance < 0 && balance < -1) {
            System.out.println("The balance is insufficient");
            return false;
        }
        if (amount > dailyWithdrawLimit) {
            System.out.println("The daily limit should not exceed 5000$");
            return false;
        }
        if (amount <= balance) {
            System.out.println("The balance is sufficient");
        }
        if (amount > 0 && amount <= balance && amount <= dailyWithdrawLimit && dailyWithdrawedAmount + amount <= dailyWithdrawLimit) {
            System.out.println("Transaction is approved. withdrawing: " + amount + "$");
            balance -= amount;
            dailyWithdrawedAmount += amount;
            return true;
        } else {
            System.out.println("Something happened! Failed to withdraw. Please try again");
        }
        return false;

    }

    public void setAccountNumber(String accountNumber) {
        boolean isValidAccountNumber = true;
        if (accountNumber.length() == 8) {
            for (int i = 0; i < 0; i++) {
                if (!Character.isDigit(accountNumber.charAt(i))) {
                    System.out.println("Warning:The account number must only contains digits.");
                    isValidAccountNumber = false;
                    break;
                }
            }
        } else {
            System.out.println("Warning: The length of account number must be 8");
            isValidAccountNumber = false;
        }
        if (isValidAccountNumber) {
            System.out.println("Successful, account number is valid.");
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Failure: The provided account number is not valid");
        }
        // log - is a message of developer for user, which tells what is going on in application.
    }

    public String getAccountNumber() {
        System.out.println("Account number: " + accountNumber);
        return accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        boolean isValidAccountHolderName = true;
        if (accountHolderName.equals(null) || accountHolderName.isEmpty() || accountHolderName.trim().length() == 0 ||
                accountHolderName.length() > 256) {
            isValidAccountHolderName = false;
        }
        if (isValidAccountHolderName) {
            System.out.println("Success: Account holder name is valid");
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Failure: account holder name must not be empty or more than 256 letters");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;

    }

    public double getBalance() {
        return balance;
    }


    public void printInfo() {
          String str = "Account holder's name: " + accountHolderName + "" + "\n" +
                "Account number: " + accountNumber + "\n" + "Current balance: " + accountNumber + "\n" +
                "Today withdrawed: " + dailyWithdrawLimit + "$";
        System.out.println();



}

}











