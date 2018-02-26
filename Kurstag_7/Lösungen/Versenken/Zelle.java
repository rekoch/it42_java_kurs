public class Zelle {
    int x;
    int y;
    boolean isSchiff;
    boolean isHit;

    public Zelle(int x, int y, boolean isSchiff){
        this.x = x;
        this.y = y;
        this.isSchiff = isSchiff;
        this.isHit = false;
    }

    /**
     *
     *  Getter und Setter
     *
     */

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getIsSchiff() {
        return isSchiff;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSchiff(boolean schiff) {
        isSchiff = schiff;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }
}
