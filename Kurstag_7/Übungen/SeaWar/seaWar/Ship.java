package seaWar;

import java.util.Random;

public class Ship {
    private String name;
    private int size;

    Ship(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
