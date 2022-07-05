package lexicon.fundamentals.oop;

public class BankAccount {
    private static int bankSeqCounter=1;
    private int bankId=100;
    private double balance;
    private Customer owner;


    public BankAccount(double balance, Customer owner){
        this.balance=balance;
        this.owner=owner;
        setBankId(bankId);

    }
    public void setBankId(int bankId){
       this.bankId=bankId+bankSeqCounter;
       bankSeqCounter++;

    }

    public int getBankId(){
        return bankId;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

   public double withDraw(double amount){
        if(amount > getBalance()){
             throw new RuntimeException("Withdraw is not possible");
        }
        balance=getBalance()-amount;
        return balance;
   }
   public double deposit(double amount){
        balance=getBalance()+amount;
        return balance;
   }
   public String getInformation(){
        return "Bank Information: "+"Bank Id: "+bankId+" Balance: "+getBalance()+" "+ owner.getCustomerInformation();
   }
}
