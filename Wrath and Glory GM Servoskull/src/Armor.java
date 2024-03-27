public class Armor extends Wargear{
    private int armorResilience;
    private String name;

    private a_Trait[] traits;

    public Armor(){}

    public Armor(int armorResilience, String name, a_Trait[] traits) {
        this.armorResilience = armorResilience;
        this.name = name;
        this.traits = traits;
    }

    class a_Trait {

        private final Trait invulnerable = new Trait("Invulnerable", "Any Armour Rating marked with an asterisk (*) is Invulnerable. If you are wearing Invulnerable Armour, AP does not affect your Resilience.", "Ignore AP", 0);
        private final Trait bulk = new Trait("Bulk", "Heavy and restrictive armor possesses the Bulk trait. Bulk reduces the Speed of the wearer by a number of inchs equal to its ratingg.", "Reduce speed by rating", 1);
        private final Trait cumbersome = new Trait("Cumbersome","Large suits of armor can severely restrict movement. You cannot Run or Sprint in Cumbersome armor.","Only move at base speed.", 2);
        private final Trait ereWeGo = new Trait("'Ere We Go!","The latent psychic power of an Ork empowers their armour, allowing them to fight harder when harmed. An Ork wearing armour with this Trait ignores the Bulk and Cumbersome Traits when Wounded","Orks ignore Bulk and Cumbersome when Wounded", 3);


        public a_Trait(){};

        public Trait getInvulnerable() {
            return invulnerable;
        }

        public Trait getBulk() {
            return bulk;
        }

        public Trait getCumbersome() {
            return cumbersome;
        }

        public Trait getEreWeGo() {
            return ereWeGo;
        }
    }
}
