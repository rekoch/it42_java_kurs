public class Zelle {
    private int x;
    private int y;
    private int wert;
    public Zelle(int x, int y, int wert){
        this.x = x;
        this.y = y;
        this.wert = wert;
    }

    public int getWert(){
        return wert;
    }

    public void setWert(int wert){
        this.wert = wert;
    }
}
