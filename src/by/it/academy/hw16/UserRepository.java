package by.it.academy.hw16;


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
   public User getUser(String login, String password){
        for (User user : userList) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
   }

   public List<User> userList(){
        return userList;
   }

    @Override
    public String toString() {
        return "UserRepository {" +
                "users =" + userList +
                '}';
    }
}

