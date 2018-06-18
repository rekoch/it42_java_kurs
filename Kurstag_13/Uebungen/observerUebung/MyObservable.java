import java.util.ArrayList;
import java.util.List;

public class MyObservable {
    List<MyObserver> observers = new ArrayList<>();

    public void add(MyObserver observer){
        observers.add(observer);
    }

    public void myNotify(Thema thema, String value){
        observers.forEach(o -> {if(o.getThemen().contains(thema)){o.doStuffOnUpdate(value);}});
    }
}
