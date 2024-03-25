public class Main {
    public static void main(String[]args){
        Agent test = new Agent(4);
        Keyword k = new Keyword(true, false, false, false);
        NameGenerator name = new NameGenerator(k, true, false);
        NameGenerator name2 = new NameGenerator(k, false, true);
        test.name = name.firstName +" " + name.lastName;
        System.out.println(name.toString());
        //System.out.println(test.toString());
    }
}
