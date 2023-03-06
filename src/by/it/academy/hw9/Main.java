package by.it.academy.hw9;


public class Main {
    public static void main(String[] args) {
        System.out.println("Divide example: " + Calculator.divide(2, 2));//task-1
        System.out.println("Multiply example: " + Calculator.multiply(15, 15));
        System.out.println("Sum example: " + Calculator.sum(100, 12));
        System.out.println("Subtract example: " + Calculator.subtraction(50, 50));
        System.out.println("----------------------------");
        //task-2
        Pair<Integer, Integer> aaa = new Pair<>(1, 2);
        System.out.println(aaa.swap());
        System.out.println("Calling the first value " + aaa.first());
        System.out.println("Calling the second value " + aaa.second());
        System.out.println("Change the first value ");
        aaa.setFirst(3);
        System.out.println("Change the second value ");
        aaa.setSecond(10);


    }
}
