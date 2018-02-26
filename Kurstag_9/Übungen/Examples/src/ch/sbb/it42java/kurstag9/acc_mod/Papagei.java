/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package ch.sbb.it42java.kurstag9.acc_mod;

public class Papagei extends Haustier {

    public Papagei(String name) {
        super(name);
    }

    @Override
    public void spiele() {                               // beachte: final!
        // der Papagei spielt, indem er spricht:
        System.out.println(getName()+" sagt: \"Hallo, ich bin der " + getName()+"\"");
    }

}
