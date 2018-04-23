package gluecksspiel;

public class MainGluecksSpiel {
    public static void main(String[] args) {
        double geld = 500;
        System.out.println("Einsatz ist: " + geld);
        GluecksSpiel gluecksSpiel = new Automat(geld);
        System.out.println("Ihr Geld ist nun: " + gluecksSpiel.spiele());
    }
}
