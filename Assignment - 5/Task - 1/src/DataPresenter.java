// Presenter component in the MVP pattern
public class DataPresenter {

    private DataModel model;
    private ConsoleView view;

    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    // Update data
    public void updateData() {
        view.displayData(model.getData());
        String newData = view.getUserInput("Enter new data: ");
        model.setData(newData);
        view.displayData("Data updated to: " + model.getData());
    }

    // Combines existing data with old data from user
    public void combineMoreData() {
        String moreData = view.getUserInput("Enter another piece of data: ");
        model.combineData(moreData);
        view.showFinalData(model.getData());
    }
}
