/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.musterloesung.kurstag05.hotel;

import java.math.BigDecimal;

public class Zimmer {

    public static final String FEATURE_MEERSICHT = "Meersicht";
    public static final String FEATURE_MINIBAR = "Minibar";
    // usw.

    private int maxAnzahlPersonen;

    private final String[] features;

    private BigDecimal kostenProUebernachtung;

    public Zimmer(int maxAnzahlPersonen, String kostenProUebernachtung, String... features) {
        this.maxAnzahlPersonen = maxAnzahlPersonen;
        this.kostenProUebernachtung = new BigDecimal(kostenProUebernachtung);
        this.features = features;
    }

    public int getMaxAnzahlPersonen() {
        return maxAnzahlPersonen;
    }

    public BigDecimal getKostenProUebernachtung() {
        return kostenProUebernachtung;
    }

    public boolean hatFeatures(String[] gewuenschteFeatures) {
        for (String gewuenschtesFeature : gewuenschteFeatures) {
            boolean featureVorhanden = false;
            for (String feature : features) {
                if (gewuenschtesFeature.equals(feature)) {
                    featureVorhanden = true;
                }
            }
            if (!featureVorhanden) {
                return false;
            }
        }
        return true;
    }
}
