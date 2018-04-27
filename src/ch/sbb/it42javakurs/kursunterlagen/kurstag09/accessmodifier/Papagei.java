/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42javakurs.kursunterlagen.kurstag09.accessmodifier;

public class Papagei extends Haustier {

    public Papagei(String name) {
        super(name);
    }


    // beachte: final --> folgende Methode kann deshalb nicht überschrieben werden!
    /*
    @Override
    public void spiele() {
        // der Papagei spielt, indem er spricht:
        System.out.println(getName()+" sagt: \"Hallo, ich bin der " + getName()+"\"");
    }
    */

}
