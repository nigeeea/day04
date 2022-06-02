package myapp.core;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;



public class Mapmain{

    public static void main(String[] args){
        BankAccount fred = new BankAccount("fred");
        BankAccount john = new BankAccount("john");


        //create a simple Map
        Map<String, BankAccount> accts = new HashMap<>();
        accts.put(fred.getAccountId(), fred);
        accts.put(john.getAccountId(), john);


        System.out.printf("size: %d\n", accts.size());
        System.out.printf("has fred: %b\n", accts.containsKey("fred"));
        System.out.printf("has fred: %b\n", accts.containsKey(fred.getAccountId()));

        Set<String> keys = accts.keySet();
        Collection<BankAccount> values = accts.values();

        BankAccount acct;
        for (String acctId: keys){
            acct = accts.get(acctId);
        }



    }
}