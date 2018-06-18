package adressKartei;

public class Adresse {
    private String name;
    private int plz;
    private String ort;
    private String strasse;

    public Adresse(int plz, String ort, String strasse, String name) {
        this.plz = plz;
        this.ort = ort;
        this.strasse = strasse;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: "+ name + " Adresse: "+ strasse +" PLZ: "+ plz +" Ort: "+ ort;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
