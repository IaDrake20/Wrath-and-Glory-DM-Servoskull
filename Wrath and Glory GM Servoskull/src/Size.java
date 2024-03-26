public class Size {
    private boolean small;

    private boolean medium;
    private boolean large;

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
