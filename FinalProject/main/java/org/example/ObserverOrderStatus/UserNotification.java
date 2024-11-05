import java.util.ArrayList;
import java.util.List;

public class UserNotification implements OrderObserver {
    @Override
    public void update(String status) {
        System.out.println("User notified: Order status is now " + status);
    }
}

// Subject class for order
class OrderStatus {
    private List<OrderObserver> observers = new ArrayList<>();
    private String status;

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(status);
        }
    }
}

