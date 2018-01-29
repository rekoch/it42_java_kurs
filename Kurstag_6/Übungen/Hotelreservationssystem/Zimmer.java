public class Zimmer {
    private int ZimmerNr;
    private String ZimmerTyp;
    private boolean ZimmerStatus;
    private double ZimmerPreis;

    public Zimmer(int zimmerNr, String zimmerTyp, boolean zimmerStatus, double zimmerPreis) {
        this.ZimmerNr = zimmerNr;
        this.ZimmerTyp = zimmerTyp;
        this.ZimmerStatus = zimmerStatus;
        this.ZimmerPreis = zimmerPreis;
    }

    public int getZimmerNr() {
        return ZimmerNr;
    }

    public void setZimmerNr(int zimmerNr) {
        ZimmerNr = zimmerNr;
    }

    public String getZimmerTyp() {
        return ZimmerTyp;
    }

    public void setZimmerTyp(String zimmerTyp) {
        ZimmerTyp = zimmerTyp;
    }

    public boolean isZimmerStatus() {
        return ZimmerStatus;
    }

    public void setZimmerStatus(boolean zimmerStatus) {
        ZimmerStatus = zimmerStatus;
    }

    public double getZimmerPreis() {
        return ZimmerPreis;
    }

    public void setZimmerPreis(double zimmerPreis) {
        ZimmerPreis = zimmerPreis;
    }
}
