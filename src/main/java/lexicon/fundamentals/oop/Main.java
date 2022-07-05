package lexicon.fundamentals.oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // creating customer Anusha
        Customer anusha=new Customer(1, "Anusha","Yenugu","anusha@gmail.com");
        System.out.println(anusha.getCustomerInformation());
        CustomerStorage customerStorage=new CustomerStorage();
        // adding customer Anusha
        customerStorage.addCustomerToCustomerStorage(anusha);
        // creating customer zeq and adding to storage
        Customer zeq=new Customer(2,"Zeq","Alidemaj","zeq@gmail.com");
        System.out.println(zeq.getCustomerInformation());
        customerStorage.addCustomerToCustomerStorage(zeq);

        //finding customer and removing customer
        System.out.println(customerStorage.findCustomer(anusha));
        customerStorage.removeCustomer(anusha);

 // creating Bank Account for customer Anusha
        BankAccount anushaAccount=new BankAccount(10000,anusha);
        anushaAccount.withDraw(1000);
        System.out.println(anushaAccount.getBalance());
        anushaAccount.deposit(1000);
        System.out.println(anushaAccount.getInformation());

//creating Bank Account for customer Zeq
        BankAccount zeqAccount=new BankAccount(1000,zeq);
        zeqAccount.deposit(10000);
        System.out.println(zeqAccount.getInformation());


        BankStorage bankStorage=new BankStorage();
        bankStorage.addBankAccounts(anushaAccount);
        bankStorage.addBankAccounts(zeqAccount);
        System.out.println(zeqAccount.getBankId());
        System.out.println(anushaAccount.getBankId());
        System.out.println(bankStorage.findBankAccount(102));
        System.out.println(bankStorage.findBankAccount(101));
        System.out.println(bankStorage.removeBankAccount(101));




    }
}