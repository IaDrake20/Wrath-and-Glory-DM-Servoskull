public class Main {
    public static void main(String[]args){
        Agent test = new Agent(3);
        Keyword k = new Keyword();
        Race human = k.getHuman();
        NameGenerator name = new NameGenerator(k, true, false);
        test.setName(name);
        test.setStats(human.getStrength(), human.getToughness(), human.getAgility(), human.getInitiative(), human.getWillpower(), human.getIntellect(), human.getFellowship(), human.getSpeed());

        System.out.println(test.toString());
    }
}
