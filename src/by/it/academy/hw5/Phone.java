package by.it.academy.hw5;

import java.util.Arrays;

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

    public String sendMessage(String ...number) {
        return "The message will be sent to the following numbers:" + "\n" + Arrays.toString(number);
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
