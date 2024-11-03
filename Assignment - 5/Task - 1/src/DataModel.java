// Model component in the MVP pattern
public class DataModel {

    private String data;

    public DataModel() {
        this.data = "Initial Data";
    }

    // return current data
    public String getData() {
        return data;
    }

    // Update data
    public void setData(String newData) {
        this.data = newData;
    }

    // Combines data
    public void combineData(String additionalData) {
        this.data += " | " + additionalData;
    }
}
