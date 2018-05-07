package ch.sbb.it42.kurstag12Uebungen;

public class Person {
    private int age;
    private int sth;

    public void print(int sth){
        System.out.println("lokale Variable ist: " + sth + ", Instanzvariable = " + this.sth);
    }

    public int getSth() {
        return sth;
    }

    public void setSth(int sth) {
        this.sth = sth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
