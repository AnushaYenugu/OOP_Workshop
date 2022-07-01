package lexicon.fundamentals.oop;

import java.util.ArrayList;

public class CustomerStorage {
    Customer customerObjects;
    ArrayList<Customer> customerStorage=new ArrayList<>();

    public boolean addCustomerToCustomerStorage(Customer customerObjects){
        customerStorage.add(customerObjects);
        return true;
    }

    public String findCustomer(Customer customerObjects){
        String customerFind = null;
        for (int i = 0; i<customerStorage.size(); i++){
            if(customerObjects.equals(customerStorage.get(i))){
                customerFind=customerStorage.get(i).getCustomerInformation();
              // customerFind= customerStorage.indexOf(i);
                break;
            }
        }
        return customerFind.toString();
    }


    public boolean removeCustomer(Customer customerObjects){
        boolean customerRemove=false;
        for (int i=0;i< customerStorage.size();i++){
            if(customerObjects.equals(customerStorage.get(i))){
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