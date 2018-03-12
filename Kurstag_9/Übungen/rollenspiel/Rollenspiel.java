import spielfiguren.Elf;
import spielfiguren.Player;
import spielfiguren.Troll;

public class Rollenspiel {

    public static void main(String[] args) {
        Player ich = new Elf("Yano", 100, 15, 100);
        Player enemy = new Troll("Ilidan", 100);

        if (ich.kaempfeGegen(enemy)){
            System.out.println("-------------");
            System.out.println("- GEWONNEN! -");
            System.out.println("-------------");

        }
        else {

            System.out.println("-------------");
            System.out.println("- VERLOREN! -");
            System.out.println("-------------");
        }

    }
}
