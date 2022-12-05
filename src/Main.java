import classes.BankAccount;
import classes.Person;
import classes.Terminal;
import enums.Bank;
import enums.Mobile;
import services.impl.BankAccountImpl;
import services.impl.TerminalImpl;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(Bank.OPTIMA_BANK,2500,"929358524222","4252");
        Person person = new Person("Nursultan","Aibek uulu","nursultanaibekuulu@gmail.com","+996700086780","ues12345",bankAccount);

        BankAccountImpl bankAccount1 = new BankAccountImpl();
        TerminalImpl terminal1 = new TerminalImpl();
        terminal1.creatTerminal(new Terminal(Mobile.O,"Red"));
        System.out.println(terminal1.transferToCard(person,"322245675892",2000));
        System.out.println(person.getBankAccount().getBalance());
        terminal1.transferToPhoneNumber(person,"+996700000111",13);
        System.out.println(person.getBankAccount().getBalance());

    }
}