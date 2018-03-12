package gegenstände;

import spielfiguren.Spielfiguren;

public class Stärketrank extends Tränke{


    public Stärketrank() {

      int doppelterAngriffswert= 2* getAngriffswert();

      setAngriffswert(doppelterAngriffswert);

    }
}
