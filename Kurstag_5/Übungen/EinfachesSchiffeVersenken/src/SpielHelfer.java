import java.io.*;

public class SpielHelfer
{
    public String getBenutzereingabe(String prompt)
    {
        String eingabeZeile = null;
        System.out.print(prompt + " ");

        try
        {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            eingabeZeile = is.readLine();
            if(eingabeZeile.length() == 0) return null;
        }
        catch (IOException e)
        {
            System.out.println("IOException: " + e);
        }

        return eingabeZeile;
    }
}
