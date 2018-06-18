package ch.sbb.it42.adresskartei.suchkriterien;

import ch.sbb.it42.adresskartei.Adresse;
import ch.sbb.it42.adresskartei.SuchKriterium;

/**
 * Eine konkrete Strategy.
 */
public class NachnamenSuchKriterium implements SuchKriterium {

    private final String gesuchterNachname;

    public NachnamenSuchKriterium(String gesuchterNachname) {
        this.gesuchterNachname = gesuchterNachname;
    }

    @Override
    public boolean istGesucht(Adresse adresse) {
        // Suche ohne Berücksichtigung führender/folgender Leerzeichen oder Gross-/Kleinschreibung
        return gesuchterNachname.trim().equalsIgnoreCase(adresse.getNachname().trim());
    }
}
