public class Keyword {

    //faction
    //private boolean imperial, chaos, xenos;
    private Faction imperial = new Faction("Imperium", new String[]{"Adepta Sororitas", "Adeptus Astartes", "Adeptus Astra Telepathica", "Adeptus Ministorum", "Adeptus Mechanicus", "Astra Militarum",
    "Inquisition", "Rogue Trader Dynasty", "Scum"});

    private Faction chaos = new Faction("Chaos", new String[]{"Traitor", "Demon"});
    private Faction xenos = new Faction("Xenos", new String[]{"Aeldar", "Ork", "Tyrannid", "Necron", "Votann"});

    //race
    private boolean human, spaceMarine, ork, eldar, demon;

    public Keyword(){
    }

    /**
     *
     * @param human
     * @param spaceMarine
     * @param ork
     * @param eldar
     * @param demon
     */
    public Keyword(boolean human, boolean spaceMarine, boolean ork, boolean eldar, boolean demon) {
        this.human = human;
        this.spaceMarine = spaceMarine;
        this.ork = ork;
        this.eldar = eldar;
        this.demon = demon;
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
                ", demon=" + demon +
                '}';
    }

    public Faction getImperial() {
        return imperial;
    }

    public void setImperial(Faction imperial) {
        this.imperial = imperial;
    }

    public Faction getChaos() {
        return chaos;
    }

    public void setChaos(Faction chaos) {
        chaos = chaos;
    }

    public Faction getXenos() {
        return xenos;
    }

    public void setXenos(Faction xenos) {
        xenos = xenos;
    }

    public boolean isHuman() {
        return human;
    }

    public void setHuman(boolean human) {
        this.human = human;
    }

    public boolean isSpaceMarine() {
        return spaceMarine;
    }

    public void setSpaceMarine(boolean spaceMarine) {
        this.spaceMarine = spaceMarine;
    }

    public boolean isOrk() {
        return ork;
    }

    public void setOrk(boolean ork) {
        this.ork = ork;
    }

    public boolean isEldar() {
        return eldar;
    }

    public void setEldar(boolean eldar) {
        this.eldar = eldar;
    }

    public boolean isDemon() {
        return demon;
    }

    public void setDemon(boolean demon) {
        this.demon = demon;
    }
}
