
package exercises.E311;

public class Account {
    private String name; //instance variable
    private double balance;
    private int ID;

    public Account() {
    }
   
    public Account (int ID){
        if(ID >= 10000000 & ID <=99999999){
            this.ID = ID;
        }else{
            System.out.println("Invalid ID. Please enter exactly 8 digits");
        }
    }
   
    public Account(String name, double balance, int ID) {
        this.name = name;
        if(balance >=0.0){
            this.balance = balance;
        }
        if(ID >= 10000000 & ID <=99999999){
            this.ID = ID;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String personInfo (int ID){
        return "Welcome, " + name +
                "\nBalance: " + balance;
    }
    
    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }
    
    public void withdraw(double withdrawAmount){
        if (withdrawAmount < balance){
            balance = balance - withdrawAmount;                                
        } else{
            System.out.println("Withdraw amount exceeded account balance");
        }
    }
}
