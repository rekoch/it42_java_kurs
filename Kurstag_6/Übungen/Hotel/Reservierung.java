/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */


public class Reservierung {
    private int start;
    private int end;
    private int einzelZimmer;
    private int doppelZimmer;

    public Reservierung(int start, int end, int einzelZimmer, int doppelZimmer) {
        this.start = start;
        this.end = end;
        this.einzelZimmer = einzelZimmer;
        this.doppelZimmer = doppelZimmer;
    }


}
