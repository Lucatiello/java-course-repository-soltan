package by.it.academy.hw7.task1;

public class StudentsTest {
    public static void main(String[] args) {
        Student student1 = new Student("Andrew", "Green", 4, "O-42", 4.73);
        Student student2 = new Student("Archie", "Parks", 2, "BA-21", 4.22);
        Student student3 = new Student("Willie", "Mack", 2, "B-21", 5);
        GraduateStudent graduateStudent1 = new GraduateStudent("Randy", "White", 5, "AB-53", 4.58, false);
        GraduateStudent graduateStudent2 = new GraduateStudent("Ricky", "Starks", 5, "AB-52", 5, true);
        GraduateStudent graduateStudent3 = new GraduateStudent("Richard", "Gir", 5, "AB-51", 5, true);
        Student[] students = new Student[]{student1, student2, student3};
        for (Student student : students) {
            System.out.println(student.getInfo());
        }
        GraduateStudent[] graduateStudent = new GraduateStudent[]{graduateStudent1, graduateStudent2, graduateStudent3};
        for (GraduateStudent graduateStudents : graduateStudent) {
            System.out.println(graduateStudents.getInfo());
        }
    }
}
