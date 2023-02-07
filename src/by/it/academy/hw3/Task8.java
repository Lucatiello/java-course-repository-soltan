package by.it.academy.hw3;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int seconds = random.nextInt(28800);
        int hours = seconds / 60 / 60;
        System.out.println("Секунд осталось " + seconds);
        switch (hours) {
            case 0:
                System.out.println("До конца рабочего дня осталось меньше часа");
                break;
            case 1:
                System.out.println("До конца рабочего дня остался " + hours + " час");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("До конца рабочего дня осталось " + hours +" часа");
                break;
            default:
                System.out.println("До конца рабочего дня осталось " + hours + " часов");
        }
    }
}
// Вынужден был написать задачку на русском языке из-за особенностей окончаний в русском языке. На английском получилась бы нелогичная белиберда