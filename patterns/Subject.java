import java.util.ArrayList;
import java.util.List;

//Observer Pattern
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public interface Observer {
        void update(String message);
    }

    public static class ConcreteObserver implements Observer {
        private String name;

        public ConcreteObserver(String name) {
            this.name = name;
        }

        @Override
        public void update(String message) {
            System.out.println(name + " received message: " + message);
        }
    }
}