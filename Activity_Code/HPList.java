import core.data.*;
import java.util.*;

public class HPList {
   public static void main(String[] args) {
      
      DataSource ds = DataSource.connect("/workspace/Data-Lab/Activity_Code/Characters.xml").load();

      System.out.println(ds.fetchString("character/Name"));
      System.out.println(ds.fetchString("character/Gender"));
      
      ArrayList<HPCharacter> allchars = ds.fetchList("HPCharacter", "character/Name", "character/Gender", "character/Job",
             "character/House", "character/Species");
             // String name, String gender, String job, String house, String species
      System.out.println("Total characters: " + allchars.size());
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Hogwarts house (Hufflepuff, Ravenclaw, Gryffindor, or Slytherin): ");
      String house = sc.nextLine();
      System.out.println("\nAll characters in " + house + ": ");
      for (HPCharacter x : allchars) {
         if (x.getHouse().toLowerCase().equals(house.toLowerCase())) System.out.println(x.getName());
      }
      

   }
}

