package ch.sbb.it42;


//Todo: wie kannst du alle static-Methoden umschreiben? Es sollen keine static-Anweisungen mehr vor kommen.
public class TooMuchStaticHere {

    private static int globalNumber = 10;

    public static void main(String[] args) {
        run();
    }

    private static void run(){
        int iAmNumber1 = 0;

        //Todo: macht man so was? Wenn nicht, wieso nicht?
        haveFunWithMyNumber(iAmNumber1);

        //Todo: macht man so was? Wenn nicht, wieso nicht?
        haveFunWithMyNumber(globalNumber);

        //Todo: begründe den Wert der Ausgabe
        System.out.println(iAmNumber1);

        //Todo: begründe den Wert der Ausgabe
        System.out.println(globalNumber);

    }

    private static void haveFunWithMyNumber(int iAmMaybeAnotherNumber) {
        iAmMaybeAnotherNumber++;
        iAmMaybeAnotherNumber++;
        iAmMaybeAnotherNumber++;
        System.out.println(iAmMaybeAnotherNumber);
    }
}
