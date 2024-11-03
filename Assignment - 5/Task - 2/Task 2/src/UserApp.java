public class UserApp {
    public static void main(String[] args) {
        // Create model and view object
        UserViewModel userViewModel = new UserViewModel();
        UserView userView = new UserView();

        // Run main method
        userView.RunFunc(userViewModel);
    }
}
