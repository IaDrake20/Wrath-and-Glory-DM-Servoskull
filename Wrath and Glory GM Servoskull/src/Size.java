public class Size {
    private boolean small;
    private boolean medium;
    private boolean large;

    private String s = "small";
    private String m = "medium";
    private String l = "large";

    public Size() {
        small = false;
        medium = false;
        large = false;
    }

    public Size(boolean _small, boolean _medium, boolean _large){
        small = _small;
        medium = _medium;
        large = _large;
    }

    public Size sizeAssigner(Race race){
        switch(race.getName()){
            case "Human":
                return new Size(false,true,false);
            case "Ork":
                return new Size(false, true, true);
            case "Aeldar":
                return new Size(false, true, false);
            case "Necron":
                return new Size(true, true, true);
        }
        return null;
    }

    public boolean isSmall() {
        return small;
    }

    public void setSmall(boolean small) {
        this.small = small;
    }

    public boolean isMedium() {
        return medium;
    }

    public void setMedium(boolean medium) {
        this.medium = medium;
    }

    public boolean isLarge() {
        return large;
    }

    public void setLarge(boolean large) {
        this.large = large;
    }
}
