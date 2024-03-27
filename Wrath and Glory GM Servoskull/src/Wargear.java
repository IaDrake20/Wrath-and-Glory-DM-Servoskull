public class Wargear {
    private int value;
    private String rarity;
    Armor armor;
    Weapon weapon;

    /**
     * Constructor for Armor
     * @param value
     * @param rarity
     */
    public Wargear(int value, String rarity, int resilience, int[] wantedATraits) {
        this.value = value;
        this.rarity = rarity;
        Armor armor = new Armor(resilience, wantedATraits);
    }

    public Wargear(int value, String rarity){
        this.value = value;
        this.rarity = rarity;
    }

    private class Weapon {
        private int damage, extraDice;
        private int shortRange, mediumRange, longRange;
        private w_Trait traits;

        public Weapon(){}

        public Weapon(int damage, int extraDice, int shortRange, int mediumRange, int longRange, w_Trait traits) {
            this.damage = damage;
            this.extraDice = extraDice;
            this.shortRange = shortRange;
            this.mediumRange = mediumRange;
            this.longRange = longRange;
            this.traits = traits;
        }

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public int getExtraDice() {
            return extraDice;
        }

        public void setExtraDice(int extraDice) {
            this.extraDice = extraDice;
        }

        public int getShortRange() {
            return shortRange;
        }

        public void setShortRange(int shortRange) {
            this.shortRange = shortRange;
        }

        public int getMediumRange() {
            return mediumRange;
        }

        public void setMediumRange(int mediumRange) {
            this.mediumRange = mediumRange;
        }

        public int getLongRange() {
            return longRange;
        }

        public void setLongRange(int longRange) {
            this.longRange = longRange;
        }

        public w_Trait getTraits() {
            return traits;
        }

        public void setTraits(w_Trait traits) {
            this.traits = traits;
        }

        @Override
        public String toString() {
            return "Weapon{" +
                    "damage=" + damage +
                    ", extraDice=" + extraDice +
                    ", shortRange=" + shortRange +
                    ", mediumRange=" + mediumRange +
                    ", longRange=" + longRange +
                    ", traits=" + traits +
                    '}';
        }
    }

    private class Armor {
        int resilienceBonus;
        a_Trait traits;

        public Armor(){}

        public Armor(int resilienceBonus, int[] wantedTraits) {
            this.resilienceBonus = resilienceBonus;
            armor = this;
            //TODO refer to helper method to grab traits

            a_Trait at = new a_Trait();

            this.traits = at;
        }

        public int getResilienceBonus() {
            return resilienceBonus;
        }

        public void setResilienceBonus(int resilienceBonus) {
            this.resilienceBonus = resilienceBonus;
        }

        public a_Trait getTraits() {
            return traits;
        }

        public void setTraits(a_Trait traits) {
            this.traits = traits;
        }

        @Override
        public String toString() {
            return "Armor{" +
                    "resilienceBonus=" + resilienceBonus +
                    ", traits=" + traits +
                    '}';
        }
    }

    class w_Trait {
        final Trait agonising = new Trait("Agonising", "Designed to inflict maximum pain, these weapons damage mind and morale as much as body", "Every wound inflicted by this weapon inflicts 1 Shock.", 0);
        final Trait arc = new Trait("Arc", "The deadly electrical discharge of Arc weapons scrambles vehicle technology", "This weapon gains +ED equal to the rating of the trait when attacking vehicles", 1);
        final Trait assault = new Trait("Assault", "Optimized for firing whilst rushing righteously towards the enemy.", "You can fire an Assault weapon as part of a Sprint but take a +2 DN penalty to the Attack", 2);
        final Trait blast = new Trait("Blast", "Explosive weapons can devastate multiple enemies\r\n" + //
                        "with a single attack.\r\n" + //
                        "When you fire or throw a Blast weapon, choose\r\n" + //
                        "any point in range (including another character!),\r\n" + //
                        "then make a DN 3 Ballistic Skill (A) Test. Apply Range\r\n" + //
                        "effects as normal (p.184) unless you are using a\r\n" + //
                        "thrown weapon like a grenade. If you fail the Test, the\r\n" + //
                        "attack misses and Scatters (p,186). If you succeed, the\r\n" + //
                        "explosion is centered on your target.\r\n" + //
                        "If you are measuring distance, the Blast rating\r\n" + //
                        "determines the radius of the explosion in metres.\r\n" + //
                        "Anyone inside this radius is hit by the attack.\r\n" + //
                        "If you are targeting a Mob or using a simplified\r\n" + //
                        "theater of the mind approach, the number of nearby\r\n" + //
                        "individuals hit by the explosive is equal to half the\r\n" + //
                        "Blast rating.\r\n" + //
                        "You cannot Shift to increase the damage of a\r\n" + //
                        "Blast weapon. If you inflict a Critical Hit with a Blast\r\n" + //
                        "weapon, the effects apply to all targets hit by the attack", "After passing a DN 3 ballistic test to hit your target, unless you are targetting a mob, use the rating of the trait to measure the radius from the target. Everything within will be hit by the attack. If targetting a mob, the number of individuals hit is equal to the rating of the trait.", 3);

        Trait brutal = new Trait("Brutal", "Brutal weapons inflict appaling, traumatic wounds.", "When rolling ED, reduce the number needed to gain a success by 1. IE if you roll a 3, that inflicts 1 wound. If you roll a 5 that inflicts two wounds.", 4);
        Trait force = new Trait("Force", "Psykers can channel the power of the Warp through the\r\n" + //
                        "etheric circuit patterns and psycho-reactive materials\r\n" + //
                        "of these weapons.", "If you have the PSYKER keyword this weapon gains +1/2 of your Willpower to damage. If you don't have the keyword reduce the damage by 2.", 5);
        Trait flamer = new Trait("Flamer", "Flamers spew a stream of burning chemical liquid. The\r\n" + //
                        "flowing torrent of flame can be guided by the wielder\r\n" + //
                        "of a Flamer to set multiple foes ablaze.\r\n" + //
                        "Attacks made with a Flamer ignore cover. If\r\n" + //
                        "you hit a target with a Flamer, blazing liquid fills the\r\n" + //
                        "space between you and your target in a straight line.\r\n" + //
                        "Anything in that line is also hit by the attack.\r\n" + //
                        "You can Shift when you make a ranged attack\r\n" + //
                        "Test with a Flamer to arc the stream of burning\r\n" + //
                        "chemicals a number of metres equal to your Ballistic\r\n" + //
                        "Skill Rating. Anything in this arc is hit by the attack.\r\n" + //
                        "Whenever you hit multiple targets, roll damage\r\n" + //
                        "once and apply that damage to all targets. Any target\r\n" + //
                        "may attempt to reduce the damage using the rules for\r\n" + //
                        "Dodging Area Effect Attacks on p.186.\r\n" + //
                        "A weapon with the Flamer Trait is considered to\r\n" + //
                        "have the Inflict (On Fire) Trait.", "When you pick a target anything between you and the target is also hit.", 6);
        //Trait heavy = new Trait(rarity, rarity, rarity);
    }

    class a_Trait {

        private Trait invulnerable = new Trait("Invulnerable", "Any Armour Rating marked with an asterisk (*) is Invulnerable. If you are wearing Invulnerable Armour, AP does not affect your Resilience.", "Ignore AP", 0);
        private Trait bulk = new Trait("Bulk", "Heavy and restrictive armor possesses the Bulk trait. Bulk reduces the Speed of the wearer by a number of inchs equal to its ratingg.", "Reduce speed by rating", 1);
        private Trait cumbersome = new Trait("Cumbersome","Large suits of armor can severely restrict movement. You cannot Run or Sprint in Cumbersome armor.","Only move at base speed.", 2);
        private Trait ereWeGo = new Trait("'Ere We Go!","The latent psychic power of an Ork empowers their armour, allowing them to fight harder when harmed. An Ork wearing armour with this Trait ignores the Bulk and Cumbersome Traits when Wounded","Orks ignore Bulk and Cumbersome when Wounded", 3);


        public a_Trait(){};
    }

    public String toString(){
        return "Value: " +value+ ". Rarity: "+rarity;
    }
}
