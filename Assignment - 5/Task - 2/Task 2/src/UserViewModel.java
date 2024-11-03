import java.util.ArrayList;
import java.util.List;

public class UserViewModel {
    // List users
    public List<UserModel> users;

    public UserViewModel() {
        users = new ArrayList<>();
    }

    // Add a user to list
    public void addUser(String name) {
        users.add(new UserModel(name));
    }

    // Returns a list of user
    public List<String> getUserNames() {
        List<String> userNames = new ArrayList<>();
        for (UserModel user : users) {
            userNames.add(user.getName());
        }
        return userNames;
    }
}
