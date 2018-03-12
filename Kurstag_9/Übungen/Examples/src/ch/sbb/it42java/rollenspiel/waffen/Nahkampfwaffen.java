package waffen;

public class Nahkampfwaffen extends Waffen {
    int verteidigungsWert;

    public Nahkampfwaffen(int angriffsWert, int verteidigungsWert){
        super(angriffsWert);
        this.verteidigungsWert = verteidigungsWert;
    }

    @Override
    public int getKampfwert(){
        return (int)(angriffsWert + verteidigungsWert * 0.5);
    }
}
