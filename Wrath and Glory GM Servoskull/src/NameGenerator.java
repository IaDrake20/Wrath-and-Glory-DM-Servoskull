import java.util.Random;
public class NameGenerator {

    Keyword keyword;

    Random random = new Random();

    //3-7
    int firstNameSize;

    //4-8
    int lastNameSize;

    String firstName, lastName;

    boolean sex;

    final char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
    final char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y','z'};

    //lazy option, will randomly pull from arrays of pre-generated first and last names
    String[] orkFNs = {"Gruk", "Dakkag", "Krugga", "Snagga", "Morka", "Grotbag", "Throgg", "Snikkit",
            "Grukk", "Wazgul", "Grimgul", "Smashgob", "Skarzag", "Gorka", "Grakka", "Snikka", "Zogrot",
            "Bludda", "Grokk", "Wurrzag", "Skullkutta", "Dregg", "Krugg", "Groggul", "Kragga", "Mogg",
            "Bluddgul", "Grimnok", "Snaggit", "Gobgut", "Krugga", "Thrakka", "Wazgul", "Krogg", "Grimgrot",
            "Snagrot", "Morkgul", "Skabkilla", "Grokkul", "Snaggul", "Groggnok", "Skragg", "Skabgul", "Grakkit",
            "Snagkit", "Gobskab", "Bluddnok", "Kruggul", "Grogg", "Skullsmasha"};

    String[] maleNobleImperialFNs = {"Alistair", "Ambrose", "Archibald", "Aurelius", "Benedict", "Cassius", "Cedric",
            "Constantine", "Cornelius", "Cyril", "Dorian", "Edmund", "Emmanuel", "Ferdinand", "Gareth", "Gideon", "Gustav",
            "Horatio", "Ignatius", "Isidore", "Julius", "Leopold", "Lysander", "Maximilian", "Nathaniel", "Octavius", "Percival",
            "Phineas", "Quentin", "Roderick", "Sebastian", "Simeon", "Theodore", "Valerian", "Winston", "Xavier", "Zephyrus",
            "Aldric", "Augustine", "Bartholomew", "Basil", "Claudius", "Cyrus", "Damian", "Emeric", "Fabian", "Gideon", "Hector",
            "Inigo", "Jeremiah", "Kilian", "Lancelot", "Matthias", "Nikolai", "Olivier", "Peregrine", "Quincy", "Reginald",
            "Sylvester", "Tobias", "Ulric", "Victor", "Wilhelm", "Xander", "Yves", "Zacharias" };

    String[] femaleNobleImperialFNs = {"Amara", "Aria", "Astrid", "Aurora", "Azura", "Brielle", "Celeste", "Dahlia", "Elara",
            "Elena", "Ember", "Esme", "Freya", "Gemma", "Hazel", "Isla", "Jasmine", "Juno", "Kaia", "Kira", "Lilith", "Luna",
            "Lyra", "Maeve", "Nova", "Ophelia", "Rhea", "Seren", "Sienna", "Skylar", "Talia", "Vera", "Willow", "Zara", "Zephyr",
            "Zora", "Adara", "Amaya", "Anya", "Athena", "Brynn", "Cora", "Darcy", "Elysia", "Fleur", "Giselle", "Harlow", "Imogen",
            "Jocelyn", "Kenna", "Lorelei", "Mira", "Nyla", "Oriana", "Phoebe", "Rosalie", "Sage", "Tessa", "Violet", "Wren", "Xanthe",
            "Yara", "Zelda", "Adelaide", "Arielle", "Calla", "Delilah", "Evangeline", "Fiorella", "Genevieve", "Hermione", "Isolde"};

    String[] maleCommonImperialFNs = {"Jax", "Talon", "Grit", "Rook", "Spike", "Rykk", "Scythe", "Thorn", "Bane", "Vex",
            "Grime", "Hawk", "Slate", "Kade", "Shade", "Finn", "Rogue", "Ash", "Kane", "Flint", "Jett", "Reeve", "Wren",
            "Cade", "Ryder", "Rust", "Dusk", "Blade", "Stark", "Viggo", "Gunn", "Bram", "Ryland", "Cinder", "Drake", "Hale",
            "Vance", "Farrow", "Creed", "Wade", "Ryker", "Sven", "Jorn", "Bjorn", "Gage", "Brant", "Rafe", "Dax", "Soren", "Kian"};

    String[] femaleCommonImperialFNs = {"Luna", "Nova", "Astra", "Raven", "Jade", "Vixen", "Raine", "Sable", "Lark", "Skylar", "Aria", "Phoenix",
            "Lyra", "Seren", "Echo", "Ember", "Willow", "Zara", "Haven", "Ria", "Lexa", "Jinx", "Wren", "Quinn", "Mara", "Azura", "Selene", "Nyssa",
            "Kiera", "Fawn", "Rosa", "Vesper", "Zephyr", "Sorrel", "Aurora", "Talia", "Elara", "Sasha", "Sylvia"};

    String[] imperialCommonLNs = {"Smith", "Jones", "Brown", "Wilson", "Evans", "Garcia", "Martinez", "Johnson", "Taylor", "Anderson", "Thomas", "Hernandez",
            "Moore", "Martin", "Jackson", "Thompson", "White", "Lopez", "Lee", "Gonzalez", "Harris", "Clark", "Lewis", "Robinson", "Walker", "Perez", "Hall",
            "Young", "Allen", "Sanchez", "Wright", "King", "Scott", "Green", "Adams", "Baker", "Nelson", "Carter", "Mitchell", "Roberts", "Phillips", "Edwards",
            "Turner", "Campbell", "Parker", "Collins", "Morris", "Rivera", "Cook", "Bailey", "Cooper", "Richardson", "Long", "Bennett", "Flores", "Reed", "Morgan",
            "Kelly", "Howard", "Ward", "Cox", "Diaz", "Richard", "Brooks", "Ward", "Reyes", "Perry", "Kim", "Sanders", "Price", "Ross"};

    String[] imperialNobleLNs = {"Avalon", "Bellamy", "Chancellor", "Devereaux", "Everhart", "Fitzgerald", "Gallant", "Hawthorne", "Ivory", "Lancaster",
            "Montgomery", "Nightingale", "Peregrine", "Quilliam", "Rutherford", "Somerset", "Tennyson", "Valentine", "Winthrop", "Ashbourne", "Beaumont",
            "Chandler", "Delacroix", "Fairchild", "Glenville", "Hastings", "Isherwood", "Llewellyn", "Monroe", "Norwood", "Pendleton", "Quincy", "Rockwell",
            "St. Clair", "Talbot", "Vanderbilt", "Windsor", "Aldridge", "Blakely", "Carmichael", "Davenport", "Eldridge", "Fitzpatrick", "Grenville", "Hollingsworth",
            "Islington", "Kensington", "Langley", "Montague", "Northcote", "Pembroke", "Quinnell", "Redgrave", "Stanhope", "Templeton", "Verlaine", "Waverly",
            "Yorkshire", "Aberdeen", "Blackwell", "Carlington", "Dunhill", "Fairfax", "Goldsmith", "Harrington", "Ingram", "Kingsley", "Lyoncourt", "Merrivale"};

    /**
     * WIP
     * Randomly grabs letters to make the names
     */
    public  NameGenerator(){
        keyword = new Keyword();
        random = new Random();

        firstNameSize = random.nextInt(7) * 10;
        while(firstNameSize == 0){

            firstNameSize = random.nextInt(7) * 10;

            //Log
            System.out.println("first name size is "+ firstNameSize);
        }

        lastNameSize = random.nextInt(7) * 10;
        while(lastNameSize == 0){

            lastNameSize = random.nextInt(7) * 10;

            //Log
            System.out.println("last name size is "+ lastNameSize);
        }


    }

    /**
     * 
     * @param _keyword
     * @param isNoble
     * @param _sex - false: F, true: M
     */
    public NameGenerator(Keyword _keyword, boolean isNoble, boolean _sex) {
        random = new Random();
        sex = _sex;

        if (_keyword.getHuman().getName().equals("Human") && isNoble) {
            //System.out.println(_sex);
            if (_sex) {
                int fn = random.nextInt(maleNobleImperialFNs.length);
                if (fn >= 0 && fn < maleNobleImperialFNs.length) { // Check bounds
                    firstName = maleNobleImperialFNs[fn];
                    //System.out.println("fn: " + firstName);
                }
            } else {
                int fn = random.nextInt(femaleNobleImperialFNs.length);
                if (fn >= 0 && fn < femaleNobleImperialFNs.length) { // Check bounds
                    firstName = femaleNobleImperialFNs[fn];
                    //System.out.println("fn: " + firstName);
                }
            }
    
            int ln = random.nextInt(imperialNobleLNs.length);
            if (ln >= 0 && ln < imperialNobleLNs.length) { // Check bounds
                lastName = imperialCommonLNs[ln];
            }
        } else if(_keyword.getHuman().getName().equals("Human")){
            if (_sex) {
                int fn = random.nextInt(maleCommonImperialFNs.length);
                if (fn >= 0 && fn < maleCommonImperialFNs.length) { // Check bounds
                    firstName = maleCommonImperialFNs[fn];
                    //System.out.println("fn: " + firstName);
                }
            } else {
                int fn = random.nextInt(femaleCommonImperialFNs.length);
                if (fn >= 0 && fn < femaleCommonImperialFNs.length) { // Check bounds
                    firstName = femaleCommonImperialFNs[fn];
                    //System.out.println("fn: " + firstName);
                }
            }

            int ln = random.nextInt(imperialCommonLNs.length);
            if (ln >= 0 && ln < imperialCommonLNs.length) { // Check bounds
                lastName = imperialCommonLNs[ln];
            }
        }
    
        System.out.println("Generated name: " + firstName + " " + lastName);
    }
    

    public String toString(){
        return "Sex: "+sex+". First name: "+firstName + ". Last name: "+lastName;
    }
}
