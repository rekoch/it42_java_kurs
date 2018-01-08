//NICHT FERTIG
import java.util.Scanner;

public class ProgrammDurchfuehren
{
    public static void startProgramm()
    {
        Scanner sc = new Scanner(System.in);

        boolean programmAn = true;
        int benutzerEingabe;
        int zaehler = 1;
        String vorname;
        String nachname;
        String gastZahl;

        while(programmAn)
        {
            gastZahl = "gast" + zaehler;
            System.out.println("Was wollen sie tun?");
            System.out.println("1) Gast erfassen");
            System.out.println("2) Zimmer buchen");
            System.out.println("3) Programm beenden");

            benutzerEingabe = sc.nextInt();

            switch(benutzerEingabe)
            {
                case 1:
                    Gast gastZahl = new Gast(name, vorname);
            }
        }
    }
}
