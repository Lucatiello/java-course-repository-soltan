package by.it.academy.hw8.task2;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("FredRosser", "2424a123~111");
        User.Query query1 = user.new Query();
        query1.printToLog();
    }
}
