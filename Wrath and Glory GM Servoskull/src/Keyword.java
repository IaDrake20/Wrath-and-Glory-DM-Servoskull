public class Keyword {

    //faction
    private boolean imperial, chaos, xenos;

    //subfaction
    private boolean imp_AdeptaSororitas, imp_AdeptusAstraTelepathica, imp_AdeptusMechanicus,
            imp_AdeptusMinistorum, imp_AstraMilitarum, imp_Inquisition,
            imp_RogueTraderDynasty, imp_Scum, imp_AdeptusAstartes;

    private boolean xenos_Eldar, xenos_Orks, chaos_Traitor, chaos_Demon;

    //race
    private boolean human, spaceMarine, ork, eldar, demon;



    public Keyword(boolean _imperial, boolean _chaos, boolean _eldar, boolean _ork){
        imperial = _imperial;
        chaos = _chaos;
        eldar = _eldar;
        ork = _ork;
    }

    public boolean isImperial() {
        return imperial;
    }

    public boolean isChaos() {
        return chaos;
    }

    public boolean isEldar() {
        return eldar;
    }

    public boolean isOrk() {
        return ork;
    }

    public void setImperial(boolean imperial) {
        this.imperial = imperial;
    }

    public void setChaos(boolean chaos) {
        this.chaos = chaos;
    }

    public void setEldar(boolean eldar) {
        this.eldar = eldar;
    }

    public void setOrk(boolean ork) {
        this.ork = ork;
    }
}
