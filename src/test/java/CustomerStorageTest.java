import lexicon.fundamentals.oop.Customer;
import lexicon.fundamentals.oop.CustomerStorage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomerStorageTest {

    CustomerStorage storage=new CustomerStorage();
    Customer anusha=new Customer(1,"Anusha","Yenugu","anusha@gmail.com");
    @Test
    public void check_CustomerStorage_information(){
        int id=2;
        String name1="Anusha1";
        String name2="Yenugu";
        String email="anusha@gmail.com";
        Customer anusha=new Customer(id,name1,name2,email);

    }

    @Test

    public void check_if_customers_are_added_to_storage(){
        //Customer anusha=new Customer(1,"Anusha","Yenugu","anusha@gmail.com");

        Assertions.assertTrue(storage.addCustomerToCustomerStorage(anusha));

    }

    @Test
    public void check_if_customers_are_find_fromStorage(){

        Assertions.assertTrue(storage.findCustomer(anusha));

        //Assertions.asssertTrue(storage.findCustomer(anusha));
    }

    @Test
    public void check_if_customers_are_removed_fromStorage(){
          Assertions.assertTrue(storage.removeCustomer(anusha));
    }

}