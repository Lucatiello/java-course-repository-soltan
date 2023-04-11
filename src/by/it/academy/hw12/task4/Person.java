package by.it.academy.hw12.task4;

import java.io.Serializable;

public class Person implements Serializable {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}



