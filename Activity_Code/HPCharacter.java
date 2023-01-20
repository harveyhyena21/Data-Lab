public class HPCharacter {
    private String name;
    private String gender;
    private String job;
    private String house;
    private String species;

    
    HPCharacter (String name, String gender, String job, String house, String species) {
        this.name = name;
        this.gender = gender;
        this.job = job;
        this.house = house;
        this.species = species;
    }
    
    //accessors
    public String getName() { 
        return name;
    }
    
    public String getGender() { 
        return gender;
    }

    public String getJob() {
        return job;
    }

    public String getHouse() {
        return house;
    }
    
    public String getSpecies() {
        return species;
    }

}
