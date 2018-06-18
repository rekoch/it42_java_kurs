import java.util.ArrayList;
import java.util.List;

public class ObserverMain {

    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        List<Thema> themen = new ArrayList<>();
        themen.add(Thema.BREAKING_NEWS);
        themen.add(Thema.MUSIK);
        Newsletter nl = new Newsletter();
        nl.setThemen(themen);
        observable.add(nl);
        List<Thema> themen2 = new ArrayList<>();
        themen2.add(Thema.MUSIK);
        themen2.add(Thema.ANDERES);
        observable.add(new Connection());
        observable.myNotify(Thema.MUSIK, "Musik-news");
        observable.myNotify(Thema.BREAKING_NEWS, "breaking-news");
    }
}