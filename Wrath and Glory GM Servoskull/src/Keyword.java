public class Keyword {

    //faction
    //private boolean imperial, chaos, xenos;
    private Faction imperial = new Faction("Imperium", new String[]{"Adepta Sororitas", "Adeptus Astartes", "Adeptus Astra Telepathica", "Adeptus Ministorum", "Adeptus Mechanicus", "Astra Militarum",
    "Inquisition", "Rogue Trader Dynasty", "Scum"});

    private Faction chaos = new Faction("Chaos", new String[]{"Traitor", "Demon"});
    private Faction xenos = new Faction("Xenos", new String[]{"Aeldar", "Ork", "Tyrannid", "Necron", "Votann"});

    //race
    private Race human = new Race("Human",0, 8,8,8,8,8,8,8,8);
    //spaceMarine, ork, eldar, demon;
    private Race spaceMarine = new Race("Space Marine",160, 10, 10, 9,9,10,10,8,9);
    private Race ork = new Race("Ork",20, 12, 12, 7, 7, 8, 7, 7, 7);
    private Race eldar = new Race("Aeldari",10, 7,7,12,12,12,10,6,10);
    private Race primarisMarine = new Race("Primaris Marine",198, 12, 12, 9, 9, 10, 10, 8, 9);


    public Keyword(){
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "imperial=" + imperial +
                ", chaos=" + chaos +
                ", xenos=" + xenos +
                ", human=" + human +
                ", spaceMarine=" + spaceMarine +
                ", ork=" + ork +
                ", eldar=" + eldar +
                ", primarisMarine=" + primarisMarine +
                '}';
    }

    public Keyword(Faction imperial, Faction chaos, Faction xenos) {
        this.imperial = imperial;
        this.chaos = chaos;
        this.xenos = xenos;
    }

    public Faction getImperial() {
        return imperial;
    }

    public Faction getChaos() {
        return chaos;
    }

    public Faction getXenos() {
        return xenos;
    }

    public Race getHuman() {
        return human;
    }

    public Race getSpaceMarine() {
        return spaceMarine;
    }

    public Race getOrk() {
        return ork;
    }

    public Race getEldar() {
        return eldar;
    }

    public Race getPrimarisMarine() {
        return primarisMarine;
    }

    public void setImperial(Faction imperial) {
        this.imperial = imperial;
    }

    public void setChaos(Faction chaos) {
        this.chaos = chaos;
    }

    public void setXenos(Faction xenos) {
        this.xenos = xenos;
    }

    public void setHuman(Race human) {
        this.human = human;
    }

    public void setSpaceMarine(Race spaceMarine) {
        this.spaceMarine = spaceMarine;
    }

    public void setOrk(Race ork) {
        this.ork = ork;
    }

    public void setEldar(Race eldar) {
        this.eldar = eldar;
    }

    public void setPrimarisMarine(Race primarisMarine) {
        this.primarisMarine = primarisMarine;
    }
}
