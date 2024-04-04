public class Main {
    public static void main(String[]args){
        Game newGame = new Game(3, 1);
        Race human = new Race("Human", 0, 8,8,8,8,8,8,8,6, false);
        Size mySize = new Size();
        mySize = mySize.sizeAssigner(human);

        //Wargear
        Wargear[] givenWargear = new Wargear[5];
        Armor myArmor = new Armor();
        myArmor = new Armor(2, "bg", myArmor.getTraits());
        givenWargear[0] = myArmor;

        //Agent
        Agent test = new Agent(newGame, human, 6, givenWargear);

        test.setSize(mySize);
        System.out.println("Size is "+mySize.isMedium());

        Keyword k = new Keyword("Human");
        Keyword k1 = new Keyword("Imperium");

        NameGenerator name = new NameGenerator(k, true, false);

        test.setMyArmor(myArmor);
        test.setName(name);
        test.setStats(human.getStrength(), human.getToughness(), human.getAgility(), human.getInitiative(), human.getWillpower(), human.getIntellect(), human.getFellowship(), human.getSpeed());
        test.setKeywords(new Keyword[]{k,k1});

        System.out.println(test.toString());
    }
}
