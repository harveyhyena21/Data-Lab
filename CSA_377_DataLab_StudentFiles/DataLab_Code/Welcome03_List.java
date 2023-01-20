/*
 * Arrays of objects
 */

import core.data.*;
import java.util.*;
import java.util.Scanner;


public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("/workspace/Data-Lab/CSA_377_DataLab_StudentFiles/DataLab_Code/weather.xml").load();
      ds.printUsageString();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name", 
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());
        
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName());
         }
      }
      

      double lowestLatitude = 90;
      WeatherStation lowestLatStation = allstns.get(0);
      for (WeatherStation ws : allstns) {
         if (ws.getLat() < lowestLatitude) {
            lowestLatitude = ws.getLat();
            lowestLatStation = ws;
         }
      }
      System.out.println("  " + lowestLatStation.getId() + ": " + lowestLatStation.getName());

   }
}
