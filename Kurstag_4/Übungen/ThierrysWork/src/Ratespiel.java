public class Ratespiel
{
    Spieler s1;
    Spieler s2;
    Spieler s3;

    public void starteSpiel()
    {
        s1 = new Spieler();
        s2 = new Spieler();
        s3 = new Spieler();

        int tipp1 = 0;
        int tipp2 = 0;
        int tipp3 = 0;

        s1.hatRecht = false;
        s2.hatRecht = false;
        s3.hatRecht = false;

        int zielZahl = (int) (Math.random() * 10) + 1;
        System.out.println("Ich denke mir eine Zahl zwischen 1 und 10 aus...");

        while(true)
        {
            System.out.println("Die zu ratende Zahl ist " + zielZahl);

            s1.raten();
            s2.raten();
            s3.raten();

            tipp1 = s1.zahl;
            tipp2 = s2.zahl;
            tipp3 = s3.zahl;

            if(tipp1 == zielZahl)
            {
            }

        }
    }
}
