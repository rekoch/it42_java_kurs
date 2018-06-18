package adressKartei;

public class SucheStrasse implements Suchkriterium{

    private String param;

    public SucheStrasse(String param) {
        this.param = param;
    }

    @Override
    public boolean istRelevant(Adresse adresses) {

        return adresses.getStrasse().equalsIgnoreCase(param);
    }
}
