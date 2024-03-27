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

    class Subfaction{
        String sub_name;
        String sub_description;

        public Subfaction(String sub_name, String sub_description) {
            this.sub_name = sub_name;
            this.sub_description = sub_description;
        }

        public String getSub_name() {
            return sub_name;
        }

        public void setSub_name(String sub_name) {
            this.sub_name = sub_name;
        }

        public String getSub_description() {
            return sub_description;
        }

        public void setSub_description(String sub_description) {
            this.sub_description = sub_description;
        }

        @Override
        public String toString() {
            return "Subfaction{" +
                    "sub_name='" + sub_name + '\'' +
                    ", sub_description='" + sub_description + '\'' +
                    '}';
        }
    }
}
