import java.util.Arrays;

public class Agent {

    //temp vars until more code is filled out
    //Get armor from wargear object
    //get tier from Game object
    //TODO: get base from _______
    int base = 0;
    Wargear myArmor;// = new Wargear.Armor();
    int tier = 0;

    //Character options
    Keyword[] keywords;
    NameGenerator name;

    //TODO: get these or set them from Race
    //physical stats
    private int strength, toughness, agility;

    //mental stats
    private int initiative, willpower, intelligence, fellowship;

    //defensive stats
    private int wounds;// = (2 * tier) + toughness,
    private int resilience;//= toughness + 1 + armor,
    private int defense;// = initiative - 1
    private int shock;// = willpower + tier;
    private  int conviction = willpower, resolve = willpower - 1;

    //Other stats
    int speed;
    Size size;

    //Skills
    private Skill athletics = new Skill();
    private Skill awareness = new Skill();
    private Skill ballistics = new Skill();
    private Skill cunning = new Skill();
    private Skill deception = new Skill();
    private Skill insight = new Skill();
    private Skill intimidation = new Skill();
    private Skill investigation = new Skill();
    private Skill leadership = new Skill();
    private Skill medicae = new Skill();
    private Skill persuasion = new Skill();
    private Skill pilot = new Skill();
    private Skill psyschicMastery = new Skill();
    private Skill scholar = new Skill();
    private Skill stealth = new Skill();
    private Skill survival = new Skill();
    private Skill tech = new Skill();
    private Skill weapons = new Skill();

    Skill[] skillArray = new Skill[18];
    String[] skillNameArray = {"athletics", "awareness", "ballistics", "cunning", "insight", "intimidation", "investigation", "leadership", "medicae", "persuasion", "pilot", "psychic mastery", 
                                "scholar", "stealth", "survival", "tech", "weapons"};
    




    //Tier Constructor
    public Agent(Game game, Race _race, int _speed, Wargear[] wargear){
        skillArray = initSkillArray();
        speed = _speed;
        int i = 0;
        myArmor = wargear[0];

        switch(game.tier){
            case 1:

                //TODO: make into helper method
                if(_race.getIsXenos()){
                    _race.setStrength(game.tier + game.rank + 1);
                    _race.setToughness(game.tier + game.rank + 1);
                    _race.setAgility(game.tier + game.rank + 1);
                    _race.setInitiative(game.tier + game.rank + 1);
                    _race.setWillpower(game.tier + game.rank + 1);
                    _race.setIntellect(game.tier + game.rank + 1);
                    _race.setFellowship(game.tier + game.rank);
                } else {
                    _race.setStrength(game.tier + game.rank);
                    _race.setToughness(game.tier + game.rank);
                    _race.setAgility(game.tier + game.rank);
                    _race.setInitiative(game.tier + game.rank);
                    _race.setWillpower(game.tier + game.rank);
                    _race.setIntellect(game.tier + game.rank);
                    _race.setFellowship(game.tier + game.rank + 1);
                }
                //TODO: turn into helper method
                for(Skill name : skillArray){
                    name.setValue(4);
                    if(i < 17){
                        name.setAttribute(skillNameArray[i]);
                        //System.out.println(name.getAttribute());
                    }
                    i++;
                }

                //TODO: add to some future helper method
                defense = _race.getInitiative() - 1;
                resilience = 4;
                wounds = 3;
                shock = 2;
                conviction = 2;
                resolve = 2;
                speed = 6;
                break;
            case 2:
                if(_race.getIsXenos()){
                    _race.setStrength(game.tier + game.rank + 2);
                    _race.setToughness(game.tier + game.rank + 2);
                    _race.setAgility(game.tier + game.rank + 2);
                    _race.setInitiative(game.tier + game.rank + 2);
                    _race.setWillpower(game.tier + game.rank + 2);
                    _race.setIntellect(game.tier + game.rank + 2);
                    _race.setFellowship(game.tier + game.rank + 2);
                } else {
                    _race.setStrength(game.tier + game.rank + 1);
                    _race.setToughness(game.tier + game.rank + 1);
                    _race.setAgility(game.tier + game.rank + 1);
                    _race.setInitiative(game.tier + game.rank + 1);
                    _race.setWillpower(game.tier + game.rank + 1);
                    _race.setIntellect(game.tier + game.rank + 1);
                    _race.setFellowship(game.tier + game.rank + 1);
                }
                for(Skill name : skillArray){
                    name.setValue(6);
                    if(i < 17){
                        name.setAttribute(skillNameArray[i]);
                        //System.out.println(name.getAttribute());
                    }
                    i++;
                }
                defense = 2;
                resilience = 8;
                wounds = 5;
                shock = 4;
                conviction = 4;
                resolve = 4;
                speed = 7;
                break;
            case 3:
                if(_race.getIsXenos()){
                    _race.setStrength(game.tier + game.rank + 2);
                    _race.setToughness(game.tier + game.rank + 2);
                    _race.setAgility(game.tier + game.rank + 2);
                    _race.setInitiative(game.tier + game.rank + 2);
                    _race.setWillpower(game.tier + game.rank + 2);
                    _race.setIntellect(game.tier + game.rank + 2);
                    _race.setFellowship(game.tier + game.rank + 2);
                } else {
                    _race.setStrength(game.tier + game.rank + 1);
                    _race.setToughness(game.tier + game.rank + 1);
                    _race.setAgility(game.tier + game.rank + 1);
                    _race.setInitiative(game.tier + game.rank + 1);
                    _race.setWillpower(game.tier + game.rank + 1);
                    _race.setIntellect(game.tier + game.rank + 1);
                    _race.setFellowship(game.tier + game.rank + 1);
                }
                for(Skill name : skillArray){
                    name.setValue(8);
                    if(i < 17){
                        name.setAttribute(skillNameArray[i]);
                        //System.out.println(name.getAttribute());
                    }
                    i++;
                }
                defense = 3;
                resilience = 10;
                wounds = 7;
                shock = 6;
                conviction = 6;
                resolve = 6;
                speed = 8;
                break;
            case 4:
                if(_race.getIsXenos()){
                    _race.setStrength(game.tier + game.rank + 2);
                    _race.setToughness(game.tier + game.rank + 2);
                    _race.setAgility(game.tier + game.rank + 2);
                    _race.setInitiative(game.tier + game.rank + 2);
                    _race.setWillpower(game.tier + game.rank + 2);
                    _race.setIntellect(game.tier + game.rank + 2);
                    _race.setFellowship(game.tier + game.rank + 2);
                } else {
                    _race.setStrength(game.tier + game.rank + 1);
                    _race.setToughness(game.tier + game.rank + 1);
                    _race.setAgility(game.tier + game.rank + 1);
                    _race.setInitiative(game.tier + game.rank + 1);
                    _race.setWillpower(game.tier + game.rank + 1);
                    _race.setIntellect(game.tier + game.rank + 1);
                    _race.setFellowship(game.tier + game.rank + 1);
                }
                for(Skill name : skillArray){
                    name.setValue(10);
                    if(i < 17){
                        name.setAttribute(skillNameArray[i]);
                        //System.out.println(name.getAttribute());
                    }
                    i++;
                }
                defense = 4;
                resilience = 12;
                wounds = 10;
                shock = 8;
                conviction = 8;
                resolve = 8;
                speed = 9;
                break;
            default:
                System.out.println("ERROR: Tier "+ tier+" not yet made");
        }
    }

    @Override
    public String toString() {
        return "Agent{" +
                "base=" + base +
                ", armor=" + myArmor +
                ", tier=" + tier +
                ", keywords=" + Arrays.toString(keywords) +
                ", name=" + name +
                ", strength=" + strength +
                ", toughness=" + toughness +
                ", agility=" + agility +
                ", initiative=" + initiative +
                ", willpower=" + willpower +
                ", intelligence=" + intelligence +
                ", fellowship=" + fellowship +
                ", wounds=" + wounds +
                ", resilience=" + resilience +
                ", defense=" + defense +
                ", shock=" + shock +
                ", conviction=" + conviction +
                ", resolve=" + resolve +
                ", speed=" + speed +
                ", size=" + size +
                ",\n athletics=" + athletics +
                ",\n awareness=" + awareness +
                ",\n ballistics=" + ballistics +
                ",\n cunning=" + cunning +
                ",\n deception=" + deception +
                ",\n insight=" + insight +
                ",\n intimidation=" + intimidation +
                ",\n investigation=" + investigation +
                ",\n leadership=" + leadership +
                ",\n medicae=" + medicae +
                ",\n persuasion=" + persuasion +
                ",\n pilot=" + pilot +
                ",\n psyschicMastery=" + psyschicMastery +
                ",\n scholar=" + scholar +
                ",\n stealth=" + stealth +
                ",\n survival=" + survival +
                ",\n tech=" + tech +
                ",\n weapons=" + weapons +
                '}';
    }

    /* Helper Methods */
    public Skill[] initSkillArray(){

        skillArray[0] = athletics;
        skillArray[1] = awareness;
        skillArray[2] = ballistics;
        skillArray[3] = cunning;
        skillArray[4] = deception;
        skillArray[5] = insight;
        skillArray[6] = intimidation;
        skillArray[7] = investigation;
        skillArray[8] = leadership;
        skillArray[9] = medicae;
        skillArray[10] = persuasion;
        skillArray[11] = pilot;
        skillArray[12] = psyschicMastery;
        skillArray[13] = scholar;
        skillArray[14] = stealth;
        skillArray[15] = survival;
        skillArray[16] = tech;
        skillArray[17] = weapons;

        return skillArray;
    }

    /* Gets & Sets */

    //Name
    public NameGenerator getName(){
        return name;
    }

    //Stats
    public int getStrength() {
        return strength;
    }

    public int getToughness(){
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

    public int getIntelligence() {
        return intelligence;
    }

    public int getFellowship() {
        return fellowship;
    }

    public int getWounds() {
        return wounds;
    }

    public int getResilience() {
        return resilience;
    }

    public int getDefense() {
        return defense;
    }

    public int getShock() {
        return shock;
    }

    public int getConviction() {
        return conviction;
    }

    public int getResolve() {
        return resolve;
    }

    public Size getSize(){
        return size;
    }

    public int getSpeed(){
        return speed;
    }

    //Skills

    public Skill getAthletics() {
        return athletics;
    }

    public Skill getAwareness() {
        return awareness;
    }

    public Skill getBallistics() {
        return ballistics;
    }

    public Skill getCunning() {
        return cunning;
    }

    public Skill getDeception() {
        return deception;
    }

    public Skill getInsight() {
        return insight;
    }

    public Skill getIntimidation() {
        return intimidation;
    }

    public Skill getInvestigation() {
        return investigation;
    }

    public Skill getLeadership() {
        return leadership;
    }

    public Skill getMedicae() {
        return medicae;
    }

    public Skill getPersuasion() {
        return persuasion;
    }

    public Skill getPilot() {
        return pilot;
    }

    public Skill getPsyschicMastery() {
        return psyschicMastery;
    }

    public Skill getScholar() {
        return scholar;
    }

    public Skill getStealth() {
        return stealth;
    }

    public Skill getSurvival() {
        return survival;
    }

    public Skill getTech() {
        return tech;
    }

    public Skill getWeapons() {
        return weapons;
    }

    //Sets

    public void setStats(int strength, int toughness, int agility, int initiative, int willpower, int intellect, int fellowship, int speed){
        this.strength = strength;
        this.toughness = toughness;
        this.agility = agility;
        this.initiative = initiative;
        this.willpower = willpower;
        this.intelligence = intellect;
        this.fellowship = fellowship;
        this.speed = speed;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setMyArmor(Wargear myArmor) {
        this.myArmor = myArmor;
    }

    public void setName(NameGenerator name){
        this.name = name;
    }

    public void setKeywords(Keyword[] keywords) {
        this.keywords = keywords;
    }

    //TODO: remove after game object is brought in as that will have the tier
    public void setTier(int num){
        this.tier = num;
    }
}
