public class PharsOMat_yves_stalder {
    public static void main(String[] args){
        String[] wortList1 = {"verlässliche", "erfolgsorientierte", "kundenorientierte", "webbasierende", "allumfassende", "clevere", "dynamische"};
        String[] wortList2 = {"gepowerte", "haftende", "fokusierende", "geteilte", "beschleunigte", "kooperative", "vernetzte"};
        String[] wortList3 = {"Vision", "Mission", "Dimension", "Kernkompetenz", "Endstufe", "Architektur", "Lösung"};

        int Einslaenge = wortList1.length;
        int Zweilaenge = wortList2.length;
        int Dreilaenge = wortList3.length;

        int rand1 = (int) (Math.random() * Einslaenge);
        int rand2 = (int) (Math.random() * Zweilaenge);
        int rand3 = (int) (Math.random() * Dreilaenge);

        String Satz = wortList1[rand1] + " " + wortList2[rand2] + " " +wortList3[rand3];

        System.out.println("Wir brauchen eine "+ Satz);
    }

}