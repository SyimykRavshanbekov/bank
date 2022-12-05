package services.impl;

import classes.Person;
import classes.Terminal;
import services.TerminalInterface;

import java.util.ArrayList;
import java.util.List;

public class TerminalImpl implements TerminalInterface {
    private List<Terminal> terminals = new ArrayList<>();
    @Override
    public String creatTerminal(Terminal terminal) {
        terminals.add(terminal);
        return "Терминал тузулду";
    }

    @Override
    public List<Terminal> getAllTerminal() {
        return terminals;
    }

    @Override
    public String transferToCard(Person person, String cardNumber, double summa) {
        try {
            if (!person.getBankAccount().getCardNumber().equals(cardNumber) && summa <= 0 ) throw new Exception();
            person.getBankAccount().setBalance(person.getBankAccount().getBalance() +  summa);
        }
        catch (Exception e){
            System.out.println("туура эмес");
        }
        return "трансфер болду";
    }

    @Override
    public String transferToPhoneNumber(Person person, String phoneNumber, double summa) {
        try {
            if (!person.getPhoneNumber().equals(phoneNumber) && summa <= 0 ) throw new Exception();
            person.getBankAccount().setBalance(person.getBankAccount().getBalance() +  summa);
        }
        catch (Exception e){
            System.out.println("туура эмес");
        }
        return "номер трансфер болду";
    }
}
