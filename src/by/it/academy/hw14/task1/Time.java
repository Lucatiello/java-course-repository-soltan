package by.it.academy.hw14.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements Runnable {
    int seconds;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(seconds * 1000L);
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                System.out.println(simpleDateFormat.format(date));
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
