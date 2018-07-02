package makler;

import makler.Ausstattung.Frau;
import makler.Ausstattung.Stuhl;
import makler.Ausstattung.Tisch;

public class maklerMain {
    public static void main(String[] args) {
        Wohnung w = new StandardWohnung();
        Wohnung tisch = new Tisch(w);
        Wohnung stuhll = new Stuhl(tisch);
        Wohnung stuhl2 = new Stuhl(stuhll);
        Wohnung frau = new Frau(stuhl2);
        System.out.println(frau.berechneWert());
    }
}
