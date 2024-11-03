import java.util.List;
import java.util.Scanner;

public class UserView {
    // Scanner input
    private final Scanner scanner;

    public UserView() {
        this.scanner = new Scanner(System.in);
    }

    // Displays the menu
    public void ShowMenu() {
        System.out.println("1. Add user");
        System.out.println("2. Display users");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    // Main loop(logic)
    public void RunFunc(UserViewModel userViewModel) {
        while (true) {
            ShowMenu();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter the name: ");
                    String name = scanner.nextLine();
                    userViewModel.addUser(name);
                    System.out.println("User added!");
                    break;
                case 2:
                    System.out.println("User list:");
                    List<String> userNames = userViewModel.getUserNames();
                    for (String user : userNames) {
                        System.out.println(" " + user);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
