package bg.smg;

import bg.smg.frame.LoginFrame;
import bg.smg.frame.MainFrame;
import bg.smg.model.Account;
import bg.smg.model.Currency;
import bg.smg.model.User;

import java.util.*;
public class Main {

    public static void main(String[] args) {
List<Account>bankAccountList=new ArrayList<>();
Account bankAccount1=new Account("BG138962146193846" , 500.50 , Currency.BGN);
bankAccountList.add(bankAccount1);
        Account bankAccount2=new Account("BG18712039712" , 360.75 , Currency.EUR);;
        bankAccountList.add(bankAccount2);

        User u=new User("u1" , "p" , bankAccountList);
        List<User> availableUsers=new ArrayList<>();
        availableUsers.add(u);
new MainFrame(u);
    }
}
