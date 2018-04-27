package ch.sbb.it42javakurs.kursunterlagen.kurstag04.stat;

import static java.lang.Math.random; // ohne static ausprobieren!

class StaticImport {
    public static void main(String[] args) {
        System.out.printf("Zahl %s gefällt mir extrem gut.", (int) (random() * 10));
    }
}

