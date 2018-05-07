package ch.sbb.it42.kurstag12Uebungen;

public class Logik {
    private Person person;
    private int myInt;
    private IntegerThings integerThings;

    public Logik(){
        myInt = 5;
        person = new Person();
        person.setAge(1);

        integerThings = new IntegerThings();
        integerThings.changeValues(myInt, person);

        System.out.println("myInt = " + myInt + " Alter = " + person.getAge());


        person.setSth(20);
        person.print(5);
        aufgaben();
    }
    private void aufgaben(){
        //Was ist die Lösung?
        myInt = 5;
        person.setAge(1);
        integerThings.changeValues(myInt, person);
        System.out.println("myInt = " + myInt + " Alter = " + person.getAge());
        //myInt = 3 Alter = 55
        //myInt = 5 Alter = 55
        //myInt = 5 Alter = 1
        //myInt = 3 Alter = 1

        Shadow shadow = new Shadow();
        shadow.setMyInt(60);
        shadow.shadow();
        System.out.println("Wert ist: " + shadow.getMyInt());
        //Wert ist: 2
        //Wert ist: 60

        shadow.setMyInt(60);
        shadow.shadow(25);
        System.out.println("Wert ist: " + shadow.getMyInt());
        //Wert ist: 25
        //Wert ist: 5
        //Wert ist: 60

    }
}
