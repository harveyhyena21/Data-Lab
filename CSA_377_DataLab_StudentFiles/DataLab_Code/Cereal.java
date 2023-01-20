import java.rmi.dgc.VMID;

public class Cereal {
    private String name;
    private String type;
    private int calories; 
    private int protein;
    private int fat;
    private int sodium;
    private int fiber;
    private int carbohydrates;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private double weight;
    private double cups;
    private double rating;


    public static void main(String[] args) {
        Cereal generic = new Cereal();
        Cereal CinnamonToastCrunch = new Cereal("Cinnamon Toast Crunch", "C", 120, 1, 3, 210, 0, 13, 9, 45, 25, 2, 1, 0.75, 19.823573);
        Cereal Cheerios = new Cereal("Cheerios", "C", 110, 6, 2, 290, 2, 17, 1, 105, 25, 1, 1, 1.25, 50.764999);



    }

    public Cereal() {
        name = "Cereal";
        type = "C";
        calories = 100;
        protein = 3;
        fat = 2;
        sodium = 200;
        fiber = 0;
        carbohydrates = 10;
        sugar = 8;
        potassium = 100;
        vitamins = 25;
        shelf = 3;
        weight = 1;
        cups = 1;
        rating = 50;
    }

    public Cereal(String name, String type, int calories, int protein, int fat, int sodium, int fiber, int carbohydrates, int sugar, int potassium, int vitamins, int shelf, int weight, double cups, double rating) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.cups = cups;
        this.rating = rating;
    }

    // accessors

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCalories() {
        return calories;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }
    
    public int getFiber() {
        return fiber;
    }
    
    public int getCarbohydrates() {
        return carbohydrates;
    }

    public int getSugar() {
        return sugar;
    }

    public int getPotassium() {
        return potassium;
    }

    public int getVitamins() {
        return vitamins;
    }

    public int getShelf() {
        return shelf;
    }

    public double getWeight() {
        return weight;
    }

    public double getCups() {
        return cups;
    }

    public double getRating() {
        return rating;
    }

    // toString method
    public String toString() {
        String statement = name + ": \n";
        statement += "\tType: " + type + "\n"; 
        statement += "\tCalories: " + calories + "\n"; 
        statement += "\tProtein: " + protein + "\n"; 
        statement += "\tFat: " + fat + "\n"; 
        statement += "\tSodium: " + sodium + "\n"; 
        statement += "\tFiber: " + fiber + "\n"; 
        statement += "\tCarbohydrates: " + carbohydrates + "\n"; 
        statement += "\tSugar: " + sugar + "\n"; 
        statement += "\tPotassium: " + potassium + "\n"; 
        statement += "\tVitamins: " + vitamins + "\n"; 
        statement += "\tShelf: " + shelf + "\n"; 
        statement += "\tWeight: " + weight + "\n"; 
        statement += "\tCups: " + cups + "\n"; 
        statement += "\tRating: " + rating + "\n"; 

        return statement;
    }
}
