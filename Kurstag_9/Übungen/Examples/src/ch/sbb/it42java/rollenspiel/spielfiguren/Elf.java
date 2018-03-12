package spielfiguren;

import waffen.Bogen;

public class Elf extends Spielfiguren {
    int zauberwert;

    public Elf(String name, int zauberwert){
        super(name);
        this.zauberwert = zauberwert;
    }

    @Override
    public double getKampfwert(int slot){
        if(waffen.size() >= slot) {
            if(waffen.get(slot) instanceof Bogen) {
                return (waffen.get(slot).getKampfwert() * ((Math.random()) * 1.1 + 0.9) + zauberwert / 2) * 2;
            }else{
                return waffen.get(slot).getKampfwert() * ((Math.random()) * 1.1 + 0.9);
            }
        }
        else{
            System.out.print("Keine Waffe auf dem Slot");
            return 0;
        }
    }
}
