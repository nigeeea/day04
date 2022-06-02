package myapp.core;

import java.util.UUID;

public class BankAccount {

    //instance fields
    private String name;
    private String accountId = UUID.randomUUID().toString().substring(0,8);

    //constructor
    public BankAccount(String name){
        this.name = name;
    }

    

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getAccountId() {
        return accountId;
    }



    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    
}
