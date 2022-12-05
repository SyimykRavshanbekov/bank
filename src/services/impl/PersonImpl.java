package services.impl;

import classes.Person;
import services.PersonInterface;

import java.util.ArrayList;
import java.util.List;

public class PersonImpl implements PersonInterface {
    private List<Person> people = new ArrayList<>();

    @Override
    public String createPerson(Person person) {
        people.add(person);
        return "Киши тузулду";
    }

    @Override
    public List<Person> getAllPeople() {
        return people;
    }
}
