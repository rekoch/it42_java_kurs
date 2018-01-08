import java.util.*;

public class DotCom
{
    ArrayList<String> zellorte;
    private String name;

    public String prüfDich (String stringTipp)
    {
        String ergebnis = "Vorbei";
        int index = zellorte.indexOf(stringTipp);

        if (index >= 0)
        {
            zellorte.remove(index);
            ergebnis = "Treffer";
            if (zellorte.isEmpty())
            {
                ergebnis = "Versenkt";
            }
        }

        System.out.println(ergebnis);

        return ergebnis;
    }

    public void setZellorte(ArrayList<String> orte)
    {
        this.zellorte = orte;
    }

    public void setName(String n)
    {
        this.name = n;
    }
}
