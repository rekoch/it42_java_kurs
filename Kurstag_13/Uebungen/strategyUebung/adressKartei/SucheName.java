package adressKartei;

public class SucheName implements Suchkriterium {

    private String param;

    public SucheName(String param) {
        this.param = param;
    }

    @Override
    public boolean istRelevant(Adresse adresses) {
        return adresses.getName().equalsIgnoreCase(param);
    }
}
