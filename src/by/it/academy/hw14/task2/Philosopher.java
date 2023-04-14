package by.it.academy.hw14.task2;

public class Philosopher implements Runnable{
    private final int maxPhilosophers;
    private int eatCounter;
    private final String name;
    private final Round round;
    private final int id;
    private final int eatTime;
    public Philosopher(String name, int id, final int maxPhilosophers, final Round round, int eatTime){
        this.name = name;
        this.round = round;
        this.maxPhilosophers = maxPhilosophers;
        this.id = id;
        this.eatTime = eatTime;
    }

    @Override
    public void run() {
        final int variations = (int) Math.floor(maxPhilosophers / 2.0);
        while (true){
            try{
                int nRound = round.getRound();
                for(int i = 0; i < variations; ++i){
                    int nIndex = nRound + i * 2;
                    if (nIndex >= maxPhilosophers){
                        nIndex -= maxPhilosophers;
                    }
                    if (id == nIndex){
                        eat();
                    }
                }
                round.next();
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    private void eat() throws InterruptedException{
        this.eatCounter += 1;
        System.out.println(name + " eat " + eatCounter + " time(s)");
        if(eatTime > 0) {
            Thread.sleep(eatTime);
        }
    }
}
