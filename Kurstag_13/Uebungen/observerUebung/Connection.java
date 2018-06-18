import java.util.List;

public class Connection implements MyObserver {

    @Override
    public void setThemen(List<Thema> themen) {
        thema.addAll(themen);
    }

    @Override
    public void doStuffOnUpdate(String value) {
        System.out.println("und ich bin glücklich darüber, konnte ich meine Verbindung updaten");
    }

    @Override
    public List<Thema> getThemen() {
        return thema;
    }
}
