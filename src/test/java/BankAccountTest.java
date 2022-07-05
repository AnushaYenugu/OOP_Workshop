import lexicon.fundamentals.oop.BankAccount;
import lexicon.fundamentals.oop.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void check_bankAccount_created(){
        int bankId=100;
        double balance=1000;
        double amount=100;
        double depositAmount=200;
        Customer owner =new Customer(1,"Anusha","Yenugu","anusha@gmail.com");
        BankAccount bankAccount=new BankAccount(balance,owner);
        Assertions.assertEquals(bankAccount.getBalance(),balance);
        Assertions.assertEquals(bankAccount.withDraw(amount),900);
        Assertions.assertEquals(bankAccount.deposit(depositAmount),1100);


    }
}
