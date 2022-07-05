package lexicon.fundamentals.oop;

import java.util.ArrayList;
import java.util.Objects;

public class CustomerStorage {
    Customer customerObjects;
    ArrayList<Customer> customerStorage=new ArrayList<>();

    public boolean addCustomerToCustomerStorage(Customer customerObjects){
        customerStorage.add(customerObjects);
        return true;
    }

    public boolean findCustomer(Customer customerObject){
        String customerFind = null;
        boolean returnValue=false;
        for (int i = 0; i<customerStorage.size(); i++){
            if(customerObject.getCustomerId() == customerStorage.get(i).getCustomerId()){
                customerFind=customerStorage.get(i).getCustomerInformation();
                System.out.println(customerFind);
                returnValue= true;
                 break;
            }
        }
        return returnValue;
    }


    public boolean removeCustomer(Customer customerObjects){
        boolean customerRemove=false;
        for (int i=0;i< customerStorage.size();i++){
            if(customerObjects.getCustomerId()==customerStorage.get(i).getCustomerId()){
               customerStorage.remove(i);
               customerRemove=true;
                System.out.println("The customer is removed");
                break;
            }
        }
        System.out.println("Customers left in storage");
        for (int i=0;i< customerStorage.size();i++) {
            System.out.println(customerStorage.get(i).getCustomerInformation());
        }



        return customerRemove;
    }

}
