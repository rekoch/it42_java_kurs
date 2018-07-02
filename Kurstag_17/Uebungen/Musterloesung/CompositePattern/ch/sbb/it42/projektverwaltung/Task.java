package ch.sbb.it42.projektverwaltung;

public class Task implements Aktivitaet {
    private final String name;
    private final double dauerInTagen;


    public Task(String name, int dauerInTagen) {
        this(name, (double) dauerInTagen);
    }

    public Task(String name, double dauerInTagen) {
        this.name = name;
        this.dauerInTagen = dauerInTagen;
    }


    @Override
    public double getGesamtDauer() {
        return dauerInTagen;
    }

    @Override
    public String getPlan(String einrueckung) {
        return einrueckung+name+"\n";
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", dauerInTagen=" + dauerInTagen +
                '}';
    }
}
