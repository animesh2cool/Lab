class Customer {
    private int accNumber;
    private String accName;
    private double accBalance;
    public void CreateAccount(int accNum, String accName, double accBal) { // For creating Account
    this.accNumber = accNum;
    this.accName = accName;
    this.accBalance = accBal;
    }
    public void setAmount(double amount) { 
    accBalance += amount;                    // Adding Amount
    System.out.println("Your A/C is credited with INR "+amount+ "\nNew balance is INR "+accBalance);
    }
    public void getAmount() { 
    System.out.println("Account Holder: "+accName);
    System.out.println("Account Balance: "+accBalance);    // Printing account details
    }
    public void withDrawAmount(double amount) { 
    accBalance-=amount;                                 // Withdraw amount
    System.out.println("Your A/C is debited by INR "+amount+ "\nNew balance is INR "+accBalance);
    }
}

public class WishBank {
    public static void main(String[] args) {
        Customer ani = new Customer(); 
        ani.CreateAccount(700001, "Animes Manna", 2378954.87);
        Customer xyz = new Customer(); 
        xyz.CreateAccount(700002, "Kunal Chaterjee", 3376321.09);
       
        ani.getAmount();                     // Calling getAmount Method
        xyz.getAmount();
        
        ani.setAmount(10000.00);      // Calling setAmount Method
        xyz.setAmount(25000.00);
        
        ani.withDrawAmount(75000.00);  // calling withDrawAmount method
        xyz.withDrawAmount(33678.49);
        }
    }