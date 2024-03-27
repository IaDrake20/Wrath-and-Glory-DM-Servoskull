public class Game {
    int tier;
    int rank;

    public Game(){}
    public Game(int tier, int rank) {
        this.tier = tier;
        this.rank = rank;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Game{" +
                "tier=" + tier +
                ", rank=" + rank +
                '}';
    }
}
