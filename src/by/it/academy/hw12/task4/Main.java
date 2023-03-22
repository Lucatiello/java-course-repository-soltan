package by.it.academy.hw12.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String filename = "D:/java course/git-java-course/src/by/it/academy/hw12/task4/person.txt";
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Boris", "White", 15));
        people.add(new Person("Edward", "Calvin", 22));
        people.add(new Person("Petr", "The First", 52));
        people.add(new Person("Connor", "O'brien", 32));
        people.add(new Person("Ricky", "Starks", 31));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
        oos.writeObject(people);
            System.out.println("File has been written");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        ArrayList<Person> newPeople = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            newPeople = ((ArrayList<Person>)ois.readObject());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        for(Person p : newPeople)
            System.out.println(p);

        people.sort(Comparator.comparing(Person :: getSurname));
        System.out.println("Sort by surname");
        for (Person person : people){
            System.out.println("Name: " + person.getName() + " Surname: " + person.getSurname() + " Age: " + person.getAge());
        }
        people.sort(Comparator.comparing(Person :: getName));
        System.out.println("\nSort by name:");
        for (Person person : people){
            System.out.println("Name: " + person.getName() + " Surname: " + person.getSurname() + " Age: " + person.getAge());
        }
    }
}

