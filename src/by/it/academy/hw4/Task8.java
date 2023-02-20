package by.it.academy.hw4;

public class Task8 {
    public static void main(String[] args) {
        int happyTickets = 0;
        for (int i = 1001; i < 1000000; i++) {
            int num1 = i / 100000 % 10,
                    num2 = i / 10000 % 10,
                    num3 = i / 1000 % 10,
                    num4 = i / 100 % 10,
                    num5 = i / 10 % 10,
                    num6 = i % 10;
            if ((num1 + num2 + num3) == (num4 + num5 + num6)) {
                happyTickets++;
            }
        }
        System.out.println("Happy tickets in one roll = " + happyTickets);
    }
}

