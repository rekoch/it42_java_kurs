import java.util.ArrayList;
import java.util.List;

public interface MyObserver {
    List<Thema> thema = new ArrayList<>();

    void setThemen(List<Thema> thema);

    void doStuffOnUpdate(String value);

    List<Thema> getThemen();
}