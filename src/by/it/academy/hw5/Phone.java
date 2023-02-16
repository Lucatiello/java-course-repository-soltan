package by.it.academy.hw5;

public class Phone {
    String number;
    String model;
    double weight;

    String receiveCall(String name) {
        return name + " is calling";
    }

    public String getNumber() { // геттер
        return number;
    }

    public String sendMessage(String number1, String number2, String number3) {
        return "The message will be sent to the following numbers:" + "\n" + number1 + "\n" + number2 + "\n" + number3;
    }

    String receiveCall(String number, String name) {
        return number + name + "is calling";
    }

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
}
