package ch.sbb.it42;

public class NumbersAndStrings {

    public static void main(String[] args) {
        new NumbersAndStrings().run();
    }

    private void run() {
        long bigNumber = 1231227895111451938L;

        System.out.printf("I am number %d", bigNumber);
        String s = String.format("\nValue ist: %,d", bigNumber);
        System.out.println(s);
        //TODO: formatiere die Zahl so um, dass sie besser lesbar ist (Tausendertrennzeichen)


        double decimalNumber = 2341234.123498357838;
        System.out.printf("I am a decimal number %f", decimalNumber);
        s = String.format("\nValue ist: %,.4f", decimalNumber);
        System.out.println(s);
        //TODO: formatiere die Zahl so um, dass sie besser lesbar ist. Zudem soll sie maximal 4 Nachkommastellen anzeigen.


        Double[] swissFrancValues = new Double[] {10.12, 11010.5678, 92357.87, 479834.548, 48395718.8782, 1384.8483};
        for (Double aNiceSwissFrancsValue : swissFrancValues){
            //TODO: formatiere das Ganze in schön um. Alle Zahlen sollen bündig untereinander stehen, Tausenderzeichen angeben sowie auf die selbe Stelle gekürzt sein
            System.out.printf("%,15.2f CHF %s", aNiceSwissFrancsValue, System.lineSeparator());
        }
    }
}
