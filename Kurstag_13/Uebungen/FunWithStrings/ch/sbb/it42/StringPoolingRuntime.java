package ch.sbb.it42;

import java.util.Scanner;

public class StringPoolingRuntime {
    public static void main(String[] args) {
        StringPoolingRuntime stringPoolingRuntime = new StringPoolingRuntime();
        stringPoolingRuntime.runIt();
    }

    private void runIt() {
        Scanner scanner = new Scanner(System.in);

        String text1 = "Hallo";
        String text2 = "Hallo";

        System.out.printf("text1 enthält den Text %s und den Hashwert %s %s", text1, text1.hashCode(), System.lineSeparator());
        System.out.printf("text2 enthält den Text %s und den Hashwert %s %s", text2, text2.hashCode(),System.lineSeparator());

        text1 = "Hallo1";
        text2 = "Hallo2";

        System.out.printf("text1 enthält den Text %s und den Hashwert %s %s", text1, text1.hashCode(), System.lineSeparator());
        System.out.printf("text2 enthält den Text %s und den Hashwert %s %s", text2, text2.hashCode(), System.lineSeparator());


        System.out.println("Bitte gib nun den Text 'Hallo2' ein, der daraufhin der Variable text1 zugewiesen wird.");

        text1 = scanner.nextLine();

        System.out.printf("text1 enthält den Text %s und den Hashwert %s %s", text1, text1.hashCode(), System.lineSeparator());
        System.out.printf("text2 enthält den Text %s und den Hashwert %s %s", text2, text2.hashCode(), System.lineSeparator());


        System.out.println("Bitte gib nun den Text 'guggus' ein, der daraufhin der Variable text1 zugewiesen wird.");

        text1 = scanner.nextLine();

        System.out.printf("text1 enthält den Text %s und den Hashwert %s %s", text1, text1.hashCode(), System.lineSeparator());
        System.out.printf("text2 enthält den Text %s und den Hashwert %s %s", text2, text2.hashCode(), System.lineSeparator());

        System.out.println("Bitte gib nun den Text 'guggus' ein, der daraufhin der Variable text2 zugewiesen wird.");

        text2 = scanner.nextLine();

        System.out.printf("text1 enthält den Text %s und den Hashwert %s %s", text1, text1.hashCode(), System.lineSeparator());
        System.out.printf("text2 enthält den Text %s und den Hashwert %s %s", text2, text2.hashCode(), System.lineSeparator());
    }
}
