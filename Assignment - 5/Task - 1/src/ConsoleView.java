import java.util.Scanner;

// View component in the MVP pattern
public class ConsoleView {

    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    // Displays the current data in the console
    public void displayData(String data) {
        System.out.println("Current Data: " + data);
    }

    // Prompts the user for input with a specified message
    public String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Displays the final combined data in the console
    public void showFinalData(String data) {
        System.out.println("Final combined data: " + data);
    }
}
