/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2018.
 */

public class EinfachesDotComTestlauf {
    public static void main (String[] args) {
        DotCom dot = new DotCom();
        int[] orte = {2,3,4};
        dot.setZellorte(orte);
        String tipp = "2";
        String return_string = dot.prüfDich(tipp);
    }


}
