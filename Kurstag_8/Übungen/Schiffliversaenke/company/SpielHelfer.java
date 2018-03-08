import java.io.*;
import java.util.*;

public class SpielHelfer {

    private int dotComAnzahl = 0;
    private int rasterLaenge = 7;
    private int rasterGroesse = 49;
    private int [] raster = new int[rasterGroesse];
    private static final  String alphabet = "abcdefg";

    public String getBenutzereingabe(String promt) {
        String eingabeZeile = null;
        System.out.println(promt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            eingabeZeile = is.readLine();
            if (eingabeZeile.length() == 0) {
                return null;
            }
        }catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return eingabeZeile;
    }

    public ArrayList<String> platziereDotCom(int dotComGroesse) {
        ArrayList<String> alphaZellen = new ArrayList<String>();
        String temp = null;
        int [] koordinaten = new int[dotComGroesse];
        int versuche = 0;
        boolean erfolg = false;
        int ort = 0;

        dotComAnzahl++;
        int inkrement = 1;
        if ((dotComAnzahl % 2) == 1){
            inkrement = rasterLaenge;
        }

        while ( !erfolg & versuche ++ < 200) {
            ort = (int) (Math.random() * rasterGroesse);
            int x = 0;
            erfolg = true;
            while (erfolg && x < dotComGroesse) {
                if(raster[ort]== 0){
                    koordinaten[x++] = ort;
                    ort += inkrement;
                    if (ort >= rasterGroesse){
                        erfolg = false;
                    }
                    if (x>0 & (ort % rasterLaenge == 0)){
                        erfolg = false;
                    }
                }
                else{
                    erfolg = false;
                }
            }
        }

        int x = 0;
        int zeile = 0;
        int spalte = 0;

        while (x < dotComGroesse){
            raster[koordinaten[x]] = 1;
            zeile = (int) (koordinaten[x] / rasterLaenge);
            spalte = koordinaten[x] % rasterLaenge;
            temp = String.valueOf(alphabet.charAt(spalte));

            alphaZellen.add(temp.concat(Integer.toString(zeile)));
            x++;
        }

        return alphaZellen;
    }

    public int[] getRaster() {
        return raster;
    }

    public void setRaster(int[] raster) {
        this.raster = raster;
    }

    public int getRasterGroesse() {
        return rasterGroesse;
    }
}
