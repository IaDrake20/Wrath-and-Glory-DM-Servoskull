/**
 * This class is mainly used by Keyword
 * For now access Race stats through Keyword
 */
public class Race {

    private String name;
    private int xpCost;
    private int maxStrength, maxToughness, maxAgility, maxInitiative, maxWillpower, maxIntellect, maxFellowship, maxSpeed;

    private boolean isXenos;

    private int strength, toughness, agility, initiative, willpower, intellect, fellowship, speed;

    public Race(String name, int xpCost, int maxStrength, int maxToughness, int maxAgility, int maxInitiative, int maxWillpower, int maxIntellect, int maxFellowship, int maxSpeed, boolean _isXenos) {
        this.name = name;
        this.xpCost = xpCost;
        this.maxStrength = maxStrength;
        this.maxToughness = maxToughness;
        this.maxAgility = maxAgility;
        this.maxInitiative = maxInitiative;
        this.maxWillpower = maxWillpower;
        this.maxIntellect = maxIntellect;
        this.maxFellowship = maxFellowship;
        this.maxSpeed = maxSpeed;
        this.isXenos = _isXenos;
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", xpCost=" + xpCost +
                ", maxStrength=" + maxStrength +
                ", maxToughness=" + maxToughness +
                ", maxAgility=" + maxAgility +
                ", maxInitiative=" + maxInitiative +
                ", maxWillpower=" + maxWillpower +
                ", maxIntellect=" + maxIntellect +
                ", maxFellowship=" + maxFellowship +
                ", maxSpeed=" + maxSpeed +
                ", strength=" + strength +
                ", toughness=" + toughness +
                ", agility=" + agility +
                ", initiative=" + initiative +
                ", willpower=" + willpower +
                ", intellect=" + intellect +
                ", fellowship=" + fellowship +
                ", speed=" + speed +
                ", isXenos= "+isXenos +
                '}';
    }

    public String getName(){
        return name;
    }

    public int getXpCost() {
        return xpCost;
    }

    public int getStrength() {
        return strength;
    }

    public int getToughness() {
        return toughness;
    }

    public int getAgility() {
        return agility;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getWillpower() {
        return willpower;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getFellowship() {
        return fellowship;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getIsXenos() {
        return isXenos;
    }

    public void setIsXenos(boolean bool){
        isXenos = bool;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setXpCost(int xpCost) {
        this.xpCost = xpCost;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void setWillpower(int willpower) {
        this.willpower = willpower;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void setFellowship(int fellowship) {
        this.fellowship = fellowship;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
