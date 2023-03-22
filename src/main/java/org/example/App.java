package org.example;

import org.example.model.Account;
import org.example.model.Address;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Address address = new Address("Jl. Kesambi Dalam", "Kampung Cantilan", "Kota Cirebon","Jawa Barat");

        // getter and setter
        Account accountParam = new Account("ditaanggraeni", "dita123", "Dita Anggraeni", "dita@gmail.com", "08190998", "29-10-1999", "Cirebon", address);
        System.out.println("Username : " + accountParam.username);
        System.out.println("Name : " + accountParam.getFullName());

        // Composition
        System.out.println(accountParam);

        Account account = new Account();
        System.out.println(account.username);

        account.setFullName("Jeon Jungkook");
        System.out.println(account.getFullName());

        account.setDob("Busan");
        System.out.println(account.getDob());
    }
}
