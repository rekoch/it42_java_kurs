package ch.sbb.it42.adresskartei;


/**
 * Die Strategy!
 */
public interface SuchKriterium {

    /**
     * Soll true zurueckliefern genau dann, wenn die uebergebene Adresse eine gesuchte Adresse ist.
     */
    boolean istGesucht(Adresse adresse);
}
