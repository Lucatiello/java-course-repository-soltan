package by.it.academy.hw5;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(); //Task1
        Person person2 = new Person("Steve ", 29);
        System.out.println(person1.move() + "\n" + person2.talk());
        System.out.println(person2.fullName + "" + person2.age + " years old");

        Phone phone1 = new Phone(); //Task2
        Phone phone2 = new Phone("+375291987543", "Nokia");
        Phone phone3 = new Phone("+375251852649", "Siemens", 2.25);
        System.out.println(phone1.receiveCall("Richard"));
        System.out.println("Number " + phone1.receiveCall("+375334126587", "\nBoris "));
        System.out.println(phone1.sendMessage("+375295154789", "+375255479874", "+375441268975"));
        System.out.println("Getter looks like this: \n" + phone1.getNumber() + " " + phone2.getNumber() + " " + phone3.getNumber());
        System.out.println("Constructor demo with two parameters " + phone2.number + " phone model " + phone2.model);
        System.out.println("Constructor demo with three parameters " + phone3.number + " phone model " + phone3.model + " phone weight " + phone3.weight + " kg");
    }
}


