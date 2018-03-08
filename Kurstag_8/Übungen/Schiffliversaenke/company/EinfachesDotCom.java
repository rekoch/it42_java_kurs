import java.util.ArrayList;

public class EinfachesDotCom {

    private ArrayList<String> zellorte;
    private String name;
    SpielHelfer sh = new SpielHelfer();
    int[] rstr = new int[sh.getRasterGroesse()];

    String pruefDich(String benutzerEingabe){
        rstr = sh.getRaster();
        String ergenis = "Vorbei";
        int index = zellorte.indexOf(benutzerEingabe);
        if (index>= 0){
            if(zellorte.isEmpty()){
                ergenis = "Versenkt";
                System.out.println("Sie haben " + name + " versenkt");
            } else {
                ergenis = "Treffer";
                rstr[index] = -1;
            }
        }
        System.out.println(ergenis);
        return ergenis;
    }

    void setZellorte(ArrayList<String> orte){
        zellorte = orte;
    }

    void setName(String n){
        name = n;
    }
}
