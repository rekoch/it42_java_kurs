package ch.sbb.it42;

public class HeroRunner {

    public static void main(String[] args) {
        new HeroRunner().run();
    }

    private void run(){
        Superman superman = new Superman();

        System.out.println("I am superman " + superman.heroName);
    }
}
