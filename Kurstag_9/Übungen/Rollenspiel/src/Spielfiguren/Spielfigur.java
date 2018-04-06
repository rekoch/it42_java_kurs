/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

package Spielfiguren;

import Gegenstände.Gegenstand;
import Gegenstände.Heiltrank;
import Ruestung.Ruestung;
import Waffen.Keule;
import Waffen.Waffe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Spielfigur {
    private String name;
    private double leben;
    private double tragkraft;
    private List<Gegenstand> gegenstaende = new ArrayList<>();
    private Waffe aktiveWaffe;
    private List<Waffe> waffen = new ArrayList<>();
    private Ruestung ruestung;

    public Spielfigur(String name) {
        waffen.add(new Keule());
        this.aktiveWaffe = waffen.get(0);
        this.name = name;
    }

    public void addWaffe(final Waffe waffe, final boolean aktiviere){
        if (tragkraft - waffe.getGewicht() >= 0){
            tragkraft -= waffe.getGewicht();
            waffen.add(0, waffe);
            if(aktiviere){
                aktiveWaffe = waffe;
            }
        }
    }

    public double getSpielerKampfwert(){
        final double res = ((double)new Random().nextInt(3) +1) / 10 + 0.8;
        return (res * aktiveWaffe.getWaffenKampfwert());
    }

    public void nehmeGegenstandAuf(Gegenstand gegenstand){
        if (tragkraft - gegenstand.getGewicht() >= 0) {
            tragkraft -= gegenstand.getGewicht();
            gegenstaende.add(gegenstand);
        }
    }

    public void reduziereLeben(double schaden){
        leben -= schaden;
    }

    public boolean heal(){
        if(getLeben() < 50){
            for (int i = 0; i < gegenstaende.size(); i++){
                if (gegenstaende.get(i) instanceof Heiltrank){
                    Heiltrank ht = (Heiltrank)gegenstaende.get(i);
                    setLeben(getLeben() + ht.getHeilwert());
                    gegenstaende.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public void zieheRuestungAn(Ruestung ruestung){
        if(tragkraft - ruestung.getGewicht() >= 0) {
            tragkraft -= ruestung.getGewicht();
            this.ruestung = ruestung;
        }
    }

    public boolean abwehr(){
        if(ruestung != null){
            return ruestung.verhindereSchaden();
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLeben() {
        return leben;
    }

    public void setLeben(double leben) {
        this.leben = leben;
    }

    public double getTragkraft() {
        return tragkraft;
    }

    public void setTragkraft(double tragkraft) {
        this.tragkraft = tragkraft;
    }

    public List<Gegenstand> getGegenstand() {
        return gegenstaende;
    }

    public void setGegenstand(List<Gegenstand> gegenstaende) {
        this.gegenstaende = gegenstaende;
    }

    public Waffe getAktiveWaffe() {
        return aktiveWaffe;
    }

    public void setAktiveWaffe(Waffe aktiveWaffe) {
        this.aktiveWaffe = aktiveWaffe;
    }

    public List<Waffe> getWaffen() {
        return waffen;
    }

    public void setWaffen(List<Waffe> waffen) {
        this.waffen = waffen;
    }

    public List<Gegenstand> getGegenstaende() {
        return gegenstaende;
    }

    public void setGegenstaende(List<Gegenstand> gegenstaende) {
        this.gegenstaende = gegenstaende;
    }

    public Ruestung getRuestung() {
        return ruestung;
    }

    public void setRuestung(Ruestung ruestung) {
        this.ruestung = ruestung;
    }
}
