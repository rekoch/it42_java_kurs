public class EinfachesDotComTestlauf
{
    public static void main (String[] args)
    {
        EinfachesDotCom dotCom = new EinfachesDotCom();
        String tipp;
        String testErgebnis = "Fehlgeschlagen";
        int[] orte = {2,3,4};
        dotCom.setZellorte(orte);

        for (int i = 1; i < 5; i++)
        {
            tipp = Integer.toString(i);
            String ergebnis = dotCom.prüfDich(tipp);
            if (tipp.equals("2") || tipp.equals("3") && ergebnis.equals("Treffer"))
            {
                testErgebnis = "Test bestanden";
                System.out.println(testErgebnis);
            }
            else if (tipp.equals("1") && ergebnis.equals("Vorbei"))
            {
                testErgebnis = "Test bestanden";
                System.out.println(testErgebnis);
            }
            else if (tipp.equals("4") && ergebnis.equals("Versenkt"))
            {
                testErgebnis = "Test bestanden";
                System.out.println(testErgebnis);
            }
            else
            {
                testErgebnis = "Test fehlgeschlagen";
                System.out.println(testErgebnis);
            }
        }

    }
}
