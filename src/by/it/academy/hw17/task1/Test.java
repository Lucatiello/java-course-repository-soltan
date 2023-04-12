package by.it.academy.hw17.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

    public class Test {
        public static void main(String[] args) throws ClassNotFoundException {
            Class<?> hashMapClass = Class.forName("java.util.HashMap");
            Field[] fields = hashMapClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.toString());
            }
            Class<?> superClass = hashMapClass.getSuperclass();
            System.out.println("Parent Class: " + superClass.getName());
            Constructor<?>[] constructors = hashMapClass.getConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.toString());
            }
            Method[] methods = hashMapClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.toString());
            }
            Class<?>[] innerClasses = hashMapClass.getDeclaredClasses();
            for (Class<?> innerClass : innerClasses) {
                System.out.println(innerClass.toString());
            }
        }
    }

