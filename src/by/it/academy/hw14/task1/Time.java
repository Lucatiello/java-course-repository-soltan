package by.it.academy.hw14.task1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time implements Runnable{

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int scanner = sc.nextInt();
        while (true) {
            try {
                Thread.sleep(scanner);
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                System.out.println(simpleDateFormat.format(date));
            } catch (InterruptedException ex){
                throw new RuntimeException(ex);
            }
        }
    }
}
