public class Main {
    // Main class
    public static void main(String[] args) {
        // Initialize Model View Presenter
        DataModel model = new DataModel();
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        // Execute data (update, combination)
        presenter.updateData();
        presenter.combineMoreData();
    }
}
