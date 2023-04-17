package by.it.academy.hw17.task2;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationMethods methods = new AnnotationMethods();
        Method annotatedMethod = methods.getClass().getMethod("annotatedMethod");
        if (annotatedMethod.isAnnotationPresent(AcademyInfo.class)) {
            AcademyInfo annotation = annotatedMethod.getAnnotation(AcademyInfo.class);
            System.out.println("The method annotatedMethod() has an @AcademyInfo(year = " + annotation.year() + ")");
        }
        Method annotatedMethodWithDefaultYear = methods.getClass().getDeclaredMethod("annotatedMethodWithDefaultYear");
        if (annotatedMethodWithDefaultYear.isAnnotationPresent(AcademyInfo.class)) {
            AcademyInfo annotation = annotatedMethodWithDefaultYear.getAnnotation(AcademyInfo.class);
            System.out.println("The method annotatedMethodWithDefaultYear() has an @AcademyInfo(year = " + annotation.year() + ")");
        }
        Method nonAnnotatedMethod = methods.getClass().getMethod("nonAnnotatedMethod");
        if (nonAnnotatedMethod.isAnnotationPresent(AcademyInfo.class)) {
            AcademyInfo annotation = nonAnnotatedMethod.getAnnotation(AcademyInfo.class);
            System.out.println("The method nonAnnotatedMethod() has an @AcademyInfo(year = " + annotation.year() + ")");
        } else {
            System.out.println("The method nonAnnotatedMethod() does not have an annotation @AcademyInfo");
        }
    }
}
