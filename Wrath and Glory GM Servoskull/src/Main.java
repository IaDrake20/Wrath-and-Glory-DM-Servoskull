public class Main {
    public static void main(String[]args){
        Game newGame = new Game(3, 1);
        Race human = new Race("Human", 0, 8,8,8,8,8,8,8,6, false);

        Wargear[] givenWargear = new Wargear[5];
        Wargear myArmor = new Wargear(0, "", 2, new int[]{0});
        //Wargear.Armor ar = new Wargear.Armor(3, "Common", 4, new int[]{0});

        Agent test = new Agent(newGame, human, 6, givenWargear);
        test.setTier(3);
        Keyword k = new Keyword("Human");
        NameGenerator name = new NameGenerator(k, true, false);
        test.setMyArmor(myArmor);
        test.setName(name);
        test.setStats(human.getStrength(), human.getToughness(), human.getAgility(), human.getInitiative(), human.getWillpower(), human.getIntellect(), human.getFellowship(), human.getSpeed());
        test.setKeywords(new Keyword[]{k});

        System.out.println(test.toString());
    }
}
