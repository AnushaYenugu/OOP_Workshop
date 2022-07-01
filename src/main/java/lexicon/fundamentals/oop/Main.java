package lexicon.fundamentals.oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer anusha=new Customer(1, "Anusha","Yenugu","anusha@gmail.com");
        System.out.println(anusha.getCustomerInformation());
        CustomerStorage customerStorage=new CustomerStorage();
        customerStorage.addCustomerToCustomerStorage(anusha);

        Customer zeq=new Customer(2,"Zeq","Alidemaj","zeq@gmail.com");
        System.out.println(zeq.getCustomerInformation());
        customerStorage.addCustomerToCustomerStorage(zeq);

        System.out.println(customerStorage.findCustomer(anusha));
        customerStorage.removeCustomer(anusha);

    }
}