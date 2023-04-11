package by.it.academy.hw10.task3;

import java.util.Stack;

public class MoneyTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(500);
        stack.push(200);
        stack.push(50);
        stack.push(100);
        stack.push(10);
        stack.push(20);
        System.out.println("What Belarusian banknotes are in the stack: " + stack);
        System.out.println("Removing the top bill: " + stack.pop());
        System.out.println("Checking the new highest bill: " + stack.peek());
        System.out.println("Checking the stack of banknotes again: " + stack);
        System.out.println("The nominally largest banknote in the stack: " + Money.max(stack));
    }
}
