package by.it.academy.hw7;

public class GraduateStudent {
    String name;
    int courseNumber;
    String groupName;
    double averageRating;
    boolean scientificWork;

    public GraduateStudent(String name, int courseNumber, String groupName, double averageRating, boolean scientificWork) {
        this.name = name;
        this.courseNumber = courseNumber;
        this.groupName = groupName;
        this.averageRating = averageRating;
        this.scientificWork = scientificWork;
    }

    String getInfo() {
        return "Student's full name: " + name + ", Course number: " + courseNumber + ", Group Name: " + groupName + ", Average Rating " + averageRating + ", Scientific Work " + scientificWork + ", ";
    }

    int getStipend() {
        int stipend;
        if (averageRating == 5) {
            stipend = 200;
        } else {
            stipend = 180;
        }
        return stipend;

    }
}