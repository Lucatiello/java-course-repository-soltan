package by.it.academy.hw14.task2;

public class Main {
    public static void main(String[] args) {
        final int counter = 5;
        String[] names = {"Aristotle", "Pythagoras", "Plato", "Socrates", "Cicero", "Kant", "Kafka"};
        Thread[] philosophers = new Thread[counter];
        Round round = new Round(counter);
        for (int i = 0; i < counter; ++i){
            philosophers[i] = new Thread(new Philosopher(names[i], i, counter, round, 1000*(1+i)));
        }
        System.out.println("Round " + round.getRound());
        for (Thread thread : philosophers){
            thread.start();
        }
    }
}
