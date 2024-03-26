import java.util.Arrays;

public class Faction {

    String name;
    String[] subfactions;

    public Faction(){
        name = "";
        subfactions = new String[1];
    }
    public Faction(String name, String[] subfactions) {
        this.name = name;
        this.subfactions = subfactions;
    }

    @Override
    public String toString() {
        return "Faction{" +
                "name='" + name + '\'' +
                ", subfactions=" + Arrays.toString(subfactions) +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSubfactions() {
        return subfactions;
    }

    public void setSubfactions(String[] subfactions) {
        this.subfactions = subfactions;
    }
}
