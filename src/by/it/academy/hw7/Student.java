package by.it.academy.hw7;

public class Student {
    String name;
    int courseNumber;
    String groupName;
    double averageRating;

    public Student(String name, int courseNumber, String groupName, double averageRating) {
        this.name = name;
        this.courseNumber = courseNumber;
        this.groupName = groupName;
        this.averageRating = averageRating;
    }

    String getInfo() {
        return "Student's full name: " + name + ", Course number: " + courseNumber + ", Group Name: " + groupName + ", Average Rating " + averageRating + ", ";
    }

    int getStipend() {
        int stipend;
        if (averageRating == 5) {
            stipend = 100;
        } else {
            stipend = 80;
        }
        return stipend;
    }
}

