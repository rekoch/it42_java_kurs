import java.util.List;

public class Newsletter implements MyObserver {

    @Override
    public void setThemen(List<Thema> themen) {
        thema.addAll(themen);
    }

    @Override
    public void doStuffOnUpdate(String value) {
        System.out.println("Jej der Newsletter wurde geupdated");
    }

    @Override
    public List<Thema> getThemen() {
        return thema;
    }
}
