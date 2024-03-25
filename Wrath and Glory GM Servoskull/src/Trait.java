public class Trait {
    private String name;
    private String description, shortDescription;
    int rating;

    public Trait(){
        name = "";
        description = "";
        shortDescription = "";
        rating = 0;
    }

    public Trait(String _name, String _description, String _sD) {
        name = _name;
        description = _description;
        shortDescription = _sD;
    }

    public Trait(String _name, String _description, String _sD, int _rating) {
        name = _name;
        description = _description;
        shortDescription = _sD;
        rating = _rating;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getShortDescription(){
        return shortDescription;
    }
    
    public int getRating(){
        return rating;
    }

    public void setName(String _name){
        name = _name;
    }

    public void setDescription(String _description){
        description = _description;
    }

    public void setShortDescription(String _sD){
        shortDescription = _sD;
    }

    public void setRating(int _rating){
        rating = _rating;
    }

    public String toString(){
        return "Name: "+name+". Short Description: "+shortDescription+". Description: "+description;
    }
}
