/*public class DotComTestlauf
{
    public static void main (String[] args)
    {
        DotCom dotCom1 = new DotCom();
        DotCom dotCom2 = new DotCom();
        DotCom dotCom3 = new DotCom();

        String tipp;
        String tippBuchstabe;
        String testErgebnis = "Fehlgeschlagen";
        String[] orteBuchstaben = {"A", "A", "A", "B", "B", "B", "D", "C", "C", "C",};

        for (int i = 1; i < 11; i++)
        {
            switch(i)
            {
                case 4:
                    i = 1;
                    break;
                case 5:
                    i = 2;
                    break;
                case 6:
                    i = 3;
                    break;
                case 7:
                    i = 1;
                    break;
                case 8:
                    i = 2;
                    break;
                case 9:
                    i = 3;
                    break;
                case 10:
                    i = 1;
                    break;
                default:
                    break;
            }

            tipp = Integer.toString(i) + orteBuchstaben[i];
            String ergebnis1 = dotCom1.prüfeRateversuch(tipp);
            String ergebnis2 = dotCom2.prüfeRateversuch(tipp);
            String ergebnis3 = dotCom3.prüfeRateversuch(tipp);
            if (tipp.equals("A1") || tipp.equals("A2") || tipp.equals("A3") && ergebnis1.equals("Treffer"))
            {
                testErgebnis = "Test bestanden";
                System.out.println(testErgebnis);
            }

            else if (tipp.equals("B1") || tipp.equals("B2") || tipp.equals("B3") && ergebnis2.equals("Treffer"))
            {
                testErgebnis = "Test bestanden";
                System.out.println(testErgebnis);
            }

            else if (tipp.equals("C2") || tipp.equals("C3") && ergebnis2.equals("Treffer"))
            {
                testErgebnis = "Test bestanden";
                System.out.println(testErgebnis);
            }

            else if (tipp.equals("D1") && ergebnis1.equals("Vorbei"))
            {
                testErgebnis = "Test bestanden";
                System.out.println(testErgebnis);
            }
            else if (tipp.equals("C1") && ergebnis3.equals("Versenkt"))
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
}*/
