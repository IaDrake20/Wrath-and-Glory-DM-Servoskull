public class Main {
    public static void main(String[]args){
        Agent test = new Agent(3);
        Keyword k = new Keyword(true, false, false, false, false);
        NameGenerator name = new NameGenerator(k, true, false);
        NameGenerator name2 = new NameGenerator(k, false, true);
        test.setName(name);
        System.out.println(name);
        System.out.println(name2);

        System.out.println(test.toString());
    }
}
