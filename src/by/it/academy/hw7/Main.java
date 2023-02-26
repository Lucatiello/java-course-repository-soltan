package by.it.academy.hw7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) { //task-1
        Student student1 = new Student("Vasiliy Petrov", 1, "BA-11", 4.22);
        Student student2 = new Student("Markus Bruce", 2, "BA-21", 5);
        Student student3 = new Student("Malcolm Green", 4, "WE-41", 4.21);
        GraduateStudent graduateStudent1 = new GraduateStudent("Randy White", 5, "AB-53", 4.58, true);
        GraduateStudent graduateStudent2 = new GraduateStudent("Ricky Starks", 5, "AB-52", 5, true);
        GraduateStudent graduateStudent3 = new GraduateStudent("Richard Gir", 5, "AB-51", 5, true);
        String[] students = {student1.getInfo() + "Scholarship = " + student1.getStipend() + "BR \n" + student2.getInfo() + "Scholarship = " + student2.getStipend() + "BR \n" + student3.getInfo() + "Scholarship = " + student3.getStipend() + "BR"};
        String[] graduateStudents = {graduateStudent1.getInfo() + "Scholarship = " + graduateStudent1.getStipend() + "BR \n" + graduateStudent2.getInfo() + "Scholarship = " + graduateStudent2.getStipend() + "BR \n" + graduateStudent3.getInfo() + "Scholarship = " + graduateStudent3.getStipend() + "BR"};
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(graduateStudents));

        System.out.println("-----------------------------------------------\n");

        Transform celsius = new Transform(15); //task2
        System.out.println("Celsius = " + celsius.celsius + "\nTransform to Kelvins = " + celsius.TransformToKelvins() + "\nTransform to Fahrenheits = " + celsius.TransformToFahrenheits());
        System.out.println("===========================================\n");

        Apple apple = new Apple(4250, 0.01);   //task3
        Apricot apricot = new Apricot(2000, 0.03);
        Pear pear = new Pear(1500, 0.02);
        System.out.println("The cost of an apple = " + apple.computeCost() + "BR");
        apple.printManufactureInfo();
        System.out.println("The cost of an apricot = " + apricot.computeCost() + "BR");
        apricot.printManufactureInfo();
        System.out.println("The cost of an pear = " + pear.computeCost() + "BR");
        pear.printManufactureInfo();
        System.out.println("Total value of all fruits = " + (apple.computeCost() + apricot.computeCost() + pear.computeCost()) + "BR");
        System.out.println("---------------------------------------\n");

        Rose rose = new Rose(5, "White");//task4
        Tulip tulip = new Tulip(7, "Red");
        Violet violet = new Violet(8, "Violet");
        System.out.println("The total cost of the bouquet, which consists " + rose.color + " " + tulip.color + " " + violet.color + " colors = " + (rose.price + tulip.price + violet.price));
        System.out.println("The rose will wither through " + rose.bestBeforeDate + " days " + "\nThe tulip will wither through " + tulip.bestBeforeDate + " days " + "\nThe violet will wither through " + violet.bestBeforeDate + " days ");
        System.out.println("The whole bouquet will wither through " + violet.bestBeforeDate + " days");
    }
}
