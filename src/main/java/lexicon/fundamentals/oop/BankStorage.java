package lexicon.fundamentals.oop;

import java.util.ArrayList;

public class BankStorage {
    BankAccount customerAccounts;
    ArrayList<BankAccount> bankAccountStorage=new ArrayList<>();


    public boolean addBankAccounts(BankAccount customerAccounts){
        bankAccountStorage.add(customerAccounts);
        return true;
    }

    public boolean findBankAccount(int bankId) {
        boolean returnValue=false;
        for (BankAccount bankAcc:bankAccountStorage) {
            if(bankAcc.getBankId()==bankId){
                System.out.println(bankAcc.getInformation());
                returnValue=true;
                break;
            }
            
        }
        return returnValue;
    }


    public boolean removeBankAccount(int bankId){
        boolean value=false;
            for(BankAccount bankAcc: bankAccountStorage){
                if(bankAcc.getBankId()==bankId){
                    bankAccountStorage.remove(bankAcc);
                     value=true;
                     break;
                }
            }
        System.out.println("Accounts left in storage");
        for(int i=0;i< bankAccountStorage.size();i++) {
            System.out.println(bankAccountStorage.get(i).getInformation());
        }

        return value;
        }
}





