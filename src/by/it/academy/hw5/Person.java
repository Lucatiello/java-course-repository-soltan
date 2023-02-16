package by.it.academy.hw5;

public class Person {
    public String fullName;
    public int age;

    String move() {
        return fullName + " is moving";
    }

    String talk() {
        return fullName + "is talking";
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }
}
