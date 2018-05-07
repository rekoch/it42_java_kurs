package ch.sbb.it42;

//FIXME: was geht hier nicht und warum?
public final class Hero {
    abstract public void createANewHero(){}

    String heroName;

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroName() {
        return heroName;
    }
}
