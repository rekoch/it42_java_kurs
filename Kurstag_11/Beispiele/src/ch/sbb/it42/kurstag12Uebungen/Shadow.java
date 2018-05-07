package ch.sbb.it42.kurstag12Uebungen;

public class Shadow {

    private int myInt;

    public int shadow(){
        myInt = 2;
        return myInt;
    }

    public int shadow(int myInt){
        myInt = 5;
        return myInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
}
