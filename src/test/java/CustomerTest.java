import lexicon.fundamentals.oop.Customer;
import lexicon.fundamentals.oop.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
   @Test
    public void check_Customer_information(){
        int id=2;
        String name1="Anusha1";
        String name2="Yenugu";
        String email="anusha@gmail.com";
        Customer anusha=new Customer(id,name1,name2,email);
        Assertions.assertEquals(id,anusha.getCustomerId());
        Assertions.assertEquals(name1,anusha.getCustomerFirstName());
        Assertions.assertEquals(name2,anusha.getCustomerLastName());
        Assertions.assertEquals(email,anusha.getCustomerEmail());

    }
}
