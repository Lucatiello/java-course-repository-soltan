package by.it.academy.hw17.task2;

public class AnnotationMethods {
    @AcademyInfo(year = 2023)
    public void annotatedMethod() {
        System.out.println("Это метод с аннотацией @AcademyInfo(year = 2023)");
    }

    @AcademyInfo(year = 2022)
    public void annotatedMethodWithDefaultYear() {
        System.out.println("Это метод с аннотацией @AcademyInfo(year = 2022)");
    }

    public void nonAnnotatedMethod() {
        System.out.println("Это метод без аннотации @AcademyInfo");
    }
}
