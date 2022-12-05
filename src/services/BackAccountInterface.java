package services;

import classes.BankAccount;
import classes.Person;
import enums.Bank;

import java.util.List;

public interface BackAccountInterface {
    String createBankAccount(BankAccount bankAccount);
    List<BankAccount> getAllBankAccount();
    double credit(Person person, Bank bank, int deposit, double summa) ;
}
