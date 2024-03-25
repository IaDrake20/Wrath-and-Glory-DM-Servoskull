public class Skill {
    private int ranks = 0;
    private String attribute = "";
    private int attribBonus = 0;

    private int value = ranks + attribBonus;

    public Skill(){
        ranks = 0;
        attribute = "";
        attribBonus = 0;
        value = 0;
    }

    public Skill(int _ranks, int _bonus, int _value, String name){
        ranks = _ranks;
        attribBonus = _bonus;
        attribute  = name;
        value = _value;
    }

    public Skill(Skill _skill){
        ranks = _skill.getRanks();
        attribBonus = _skill.getBonus();
        attribute = _skill.getAttribute();
        value = _skill.getValue();
    }

    public String toString(){
        return "Value: "+ value + ". Rank(s): "+ ranks + ". Bonus: " + attribBonus + ". Attribute: " + attribute;
    }

    /* Gets and Sets */
    public int getRanks(){
        return ranks;
    }

    public int getBonus(){
        return attribBonus;
    }

    public String getAttribute(){
        return attribute;
    }

    public int getValue() {
        return value;
    }

    public void setRanks(int _rank){
        ranks = _rank;
    }

    public void setAttribute(String _name){
        attribute = _name;
    }

    public void setAttribBonus(int _bonus){
        attribBonus = _bonus;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
