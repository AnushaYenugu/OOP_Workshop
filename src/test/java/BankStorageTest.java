import lexicon.fundamentals.oop.BankAccount;
import lexicon.fundamentals.oop.BankStorage;
import lexicon.fundamentals.oop.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankStorageTest {

    Customer owner;
    BankAccount bankAccountAnusha;
    BankStorage bankStorage;

    @BeforeEach
    void setUp(){
       owner =new Customer(1,"Anusha","Yenugu","anusha@gmail.com");
        bankAccountAnusha=new BankAccount(1000,owner);
         bankStorage=new BankStorage();
         bankStorage.addBankAccounts(bankAccountAnusha);
    }

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

    @Test

    public void check_whether_bankAccounts_are_added_toStorage(){

        Assertions.assertTrue(bankStorage.addBankAccounts(bankAccountAnusha));
    }

    @Test

    public void check_whether_bankAccount_can_be_found_fromStorage(){
        Assertions.assertTrue(bankStorage.findBankAccount(101));
    }


    @Test

    public void check_whether_bankAccount_can_be_removed_fromStorage(){
        Assertions.assertTrue(bankStorage.removeBankAccount(101));
    }


}

