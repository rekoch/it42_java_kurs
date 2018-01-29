public class Hotel {
    private Zimmer[] zimmer = new Zimmer[5];

    public boolean zimmerFrei() {
        for (Zimmer z :zimmer) {
            boolean status = z.isZimmerStatus();
            if (status) {
                return true;
            }
        }
        return false;
    }
}
