package by.it.academy.hw12.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3Test {
    public static void main(String[] args) {

        File binary = new File("D:/java course/git-java-course/src/by/it/academy/hw12/task3/binary.txt");
        try(FileOutputStream fileOutputStream = new FileOutputStream(binary)){
            binary.createNewFile();
            System.out.println(binary.getName() + " file created");
            float average = 0;
            float sum = 0;
            byte[] digitArray = new byte[30];
            for (int i = 0; i < 30; i++){
                byte digit = (byte) (1 + Math.random() * 100);
                digitArray[i] = digit;
                sum += digitArray[i];
                average = sum/30;
            }
            System.out.println("Average: " + average);
            fileOutputStream.write(digitArray);
            for (int a : digitArray){
                System.out.println(a);
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("----------");
        try(FileInputStream fileInputStream = new FileInputStream(binary)){
            byte[] digitByte = new byte[30];
            fileInputStream.read(digitByte);
            for(byte r : digitByte){
                System.out.println(r);
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
