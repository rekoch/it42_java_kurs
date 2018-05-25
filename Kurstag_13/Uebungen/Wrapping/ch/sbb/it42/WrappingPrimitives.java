package ch.sbb.it42;

import java.util.ArrayList;
import java.util.List;

public class WrappingPrimitives {

    public static void main(String[] args) {
        new WrappingPrimitives().run();
    }

    private void run() {
        int primitiveInt = 1;
        int primitiveInt2 = 2;

        //Fixme: was musst du hier korrigieren? Und wieso?
        List<int> someNumbers = new ArrayList<>();

        someNumbers.add(primitiveInt);
        someNumbers.add(primitiveInt2);

        //TODO: Geht das? Begründe! Beachte den Datentyp
        for (int number : someNumbers){
            System.out.println("I am number: " + number);
        }

        //TODO: Geht das? Begründe!
        //Todo: hast du eine Erklärung für den Hashcode?
        for (Integer number : someNumbers){
            System.out.printf("I am number %d. My value is %d and my Hashcode is %d", number, number.intValue(), number.hashCode());
            System.out.println();
        }

        String aNumberAsAString = "1";
        String aNumberAsAString2 = "2";

        List<String> someNumberStrings = new ArrayList<>();
        someNumberStrings.add(aNumberAsAString);
        someNumberStrings.add(aNumberAsAString2);

        for (String stringNumber : someNumberStrings){
            //Todo: wieso klappt das?
            int parsed = Integer.getInteger(stringNumber);
            System.out.printf("I am a converted string and my value is %d", parsed);

            //Todo: wieso kann ich das nicht?
            //int parsed2 = int.getInteger(stringNumber);
        }

        //TODO: was musst du machen, damit du einem int NULL zuweisen kannst?
        // int nullInt = null;

        //Todo: wieso geht das nicht?
        int maybeIAmNull = 0;
        //if(maybeIAmNull == null){
        //    System.out.printf("Hello my value is %d", maybeIAmNull);
        //}
    }
}
