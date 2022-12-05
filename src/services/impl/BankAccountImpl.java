package services.impl;

import classes.BankAccount;
import classes.Person;
import enums.Bank;
import services.BackAccountInterface;

import java.util.ArrayList;
import java.util.List;

public class BankAccountImpl implements BackAccountInterface {
    private List<BankAccount> bankAccounts = new ArrayList<>();
    @Override
    public String createBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
        return "Сиздин банк аккаунт ачылды!";
    }

    @Override
    public List<BankAccount> getAllBankAccount() {
        return bankAccounts;
    }

    @Override
    public double credit(Person person, Bank bank, int deposit, double summa) {
        double credit = (summa * deposit) / summa;
        person.getBankAccount().setBalance(person.getBankAccount().getBalance() + summa);
        System.out.println("Сизге кредит берилди!");
        return summa+credit;
    }
}
