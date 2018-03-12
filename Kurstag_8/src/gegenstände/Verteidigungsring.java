package gegenstände;

import spielfiguren.Spielfiguren;

public class Verteidigungsring extends Ringe{

    public Verteidigungsring() {


        int doppelterVerteidigungswert = 2 * getVerteidigungswert();

        setVerteidigungswert(doppelterVerteidigungswert);


    }
}
