package by.it.academy.hw11;


import java.util.ArrayList;
import java.util.List;


public class UserRepository {
    private final List<User> userList = new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }

    public boolean existUserByLogin(String login){
        for (User user : userList){
            if (user.getLogin().equals(login)){
                return true;
            }
        }
        return false;
    }
   public boolean existUserByLoginAndPassword(String login, String password){
        for (User user : userList){
            if (user.getLogin().equals(login) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
   }
}
