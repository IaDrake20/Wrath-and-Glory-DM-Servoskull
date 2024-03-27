public class Wargear {
    private String rarity;
    private int value;
    private Keyword[] keywords;

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Keyword[] getKeywords() {
        return keywords;
    }

    public void setKeywords(Keyword[] keywords) {
        this.keywords = keywords;
    }
}
