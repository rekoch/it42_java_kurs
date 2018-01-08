public class Spieler
{
    int zahl;
    int tipp;
    boolean hatRecht;

    public void raten()
    {
        zahl = (int) (Math.random() * 10) + 1;
        System.out.println("Ich tippe auf die Zahl: " + zahl);
    }
}
