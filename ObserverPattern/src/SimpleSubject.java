import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class SimpleSubject extends Observable implements Subject {
    private ArrayList<Observer> observerArrayList;
    private int value = 0;

    public SimpleSubject() {
        observerArrayList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerArrayList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerArrayList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerArrayList) {
            observer.update(this, value); // Pass both the subject and the value to update
        }
    }

    public void setValue(int value){
        this.value = value;
        notifyObserver();
    }
}
