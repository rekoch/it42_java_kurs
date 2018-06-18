/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42.jsondb;

public class AdressDatenbankException extends RuntimeException {
    private final String fehlertext;

    public AdressDatenbankException(String fehlertext, Exception urspruenglicheException) {
        super(urspruenglicheException); // man koennte die urspruengliche Exception auch in einer separaten Instanzvariable speichern
        this.fehlertext = fehlertext;
    }

    public String getFehlertext() {
        return fehlertext;
    }
}
