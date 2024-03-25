public class Agent {

    //temp vars until more code is filled out
    int base = 0;
    int armor = 0;
    int tier = 0;

    //Character options
    Keyword[] keywords;
    NameGenerator name;

    //physical stats
    private int strength, toughness, agility;

    //mental stats
    private int initiative, willpower, intelligence, fellowship;

    //defensive stats
    private int wounds = (2 * tier) + toughness, resilience = toughness + 1 + armor, defense = initiative - 1, shock = willpower + tier;
    private  int conviction = willpower, resolve = willpower - 1;

    //Other stats
    int speed;


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
    public Agent(int tier){
        skillArray = initSkillArray();
        int i = 0;
        switch(tier){
            case 1:

                //TODO: turn into helper method
                for(Skill name : skillArray){
                    name.setValue(4);
                    if(i < 17){
                        name.setAttribute(skillNameArray[i]);
                        //System.out.println(name.getAttribute());
                    }
                    i++;
                }
                defense = 1;
                resilience = 4;
                wounds = 3;
                shock = 2;
                conviction = 2;
                resolve = 2;
                speed = 6;
                break;
            case 2:
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
                "strength=" + strength +
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
                ", size=" + size +
                ", speed=" + speed +
                ", athletics=" + athletics +
                ", awareness=" + awareness +
                ", ballistics=" + ballistics +
                ", cunning=" + cunning +
                ", deception=" + deception +
                ", insight=" + insight +
                ", intimidation=" + intimidation +
                ", investigation=" + investigation +
                ", leadership=" + leadership +
                ", medicae=" + medicae +
                ", persuasion=" + persuasion +
                ", pilot=" + pilot +
                ", psyschicMastery=" + psyschicMastery +
                ", scholar=" + scholar +
                ", stealth=" + stealth +
                ", survival=" + survival +
                ", tech=" + tech +
                ", weapons=" + weapons +
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

    public int getSize(){
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

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setName(NameGenerator name){
        this.name = name;
    }
}
