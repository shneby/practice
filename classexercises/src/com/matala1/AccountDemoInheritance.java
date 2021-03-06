package com.matala1;

import com.matala2Inheritance.Normal;
import com.matala2Inheritance.Premium;
import com.matala2Inheritance.Priority;

public class AccountDemoInheritance {
    public static void main(String[] args) {
        Account account = new Account("Bas001", "Omri");
        Account normal = new Normal("Nor001", "Omri");
        Account priority = new Priority("Pri001", "Omri");
        Account premium = new Premium("Pre001", "Omri");

        account.setName("Omri's base account");
        normal.setName("Omri's normal account");
        priority.setName("Omri's priority account");
        premium.setName("Omri's premium account");

        account.deposit(100);
        normal.deposit(100);
        priority.deposit(100);
        premium.deposit(100);

        account.withdraw(4);
        normal.withdraw(4);
        priority.withdraw(4);
        premium.withdraw(4);

        account.describe();
        normal.describe();
        priority.describe();
        premium.describe();
    }
}
