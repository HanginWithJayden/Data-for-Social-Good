public class UserStory {

  private String[] names;
  private int[] calories;
  private double[] fats;
  private double[] proteins;
  private int[] cholesterol;

  public UserStory(String namesFile, String caloriesFile, String fatsFile, String proteinsFile, String cholesterolFile) {
    names = FileReader.toStringArray(namesFile);
    calories = FileReader.toIntArray(caloriesFile);
    fats = FileReader.toDoubleArray(fatsFile);
    proteins = FileReader.toDoubleArray(proteinsFile);
    cholesterol = FileReader.toIntArray(cholesterolFile);
  }

  public void findHighCalHighFat() {
    // 0. Make variable for highest calories (set equal to calories[0])
    //    Make variable for highest fats (set equals fats[0])
    //    Make variable for highest index
    int highCal = calories[0];
    double highFat = fats[0];
    int highIndex = 0;
    
    // 1. Traverse the calories array using a index for-loop
    for (int i = 0; i < calories.length; i++) {
      // 2. If the calories at that index is more  that the highest calories AND the fat at that index is 
      //    more that the highest fat
      if (calories[i] > highCal && fats[i] > highFat) {
        // 3. set to be the new highest calories/fat, update highest index
        highCal = calories[i];
        highFat = fats[i];
        highIndex = i;
      }
    }
    // 4. Print out info for food at the highest index
    String product = "Name: " + names[highIndex] + "\nCalories: " + calories[highIndex] + "\nFats: " + fats[highIndex] + "\nProteins: " + proteins[highIndex] + "\nCholesterol: " + cholesterol[highIndex] + "\n\n";

    System.out.println(product);
  }

  public void findHighProteinsLowChol() {
    // Make variable for highest proteins (set equal to proteins[0])
    // Make variable for lowest cholesterol (set equals cholesterol[0])
    // Make variable for middle index
    double highProteins = proteins[0];
    int lowChol = cholesterol[0];
    int midIndex = 0;
    
    // Traverse the proteins array using a index for-loop
    for (int index = 0; index < proteins.length; index++) {
      // If the proteins at that index is more than that the highest proteins AND the cholesterol at that index is 
      // less that the lowest cholesterol
      if (proteins[index] > highProteins && cholesterol[index] < lowChol) {
        // Set to be the new highest proteins and lowest cholesterol, update middle index
        highProteins = proteins[index];
        lowChol = cholesterol[index];
        midIndex = index;
      }
    }
    // Print out info for food at the middle index
    String product = "Name: " + names[midIndex] + "\nCalories: " + calories[midIndex] + "\nFats: " + fats[midIndex] + "\nProteins: " + proteins[midIndex] + "\nCholesterol: " + cholesterol[midIndex] + "\n\n";

    System.out.println(product);
  }
  
  public String toString() {
    // Return with a format
    String result = "";

    for (int i = 0; i < names.length; i++) {
      result = result + "Name: " + names[i] + "\nCalories: " + calories[i] + "\nFats: " + fats[i] + "\nProteins: " + proteins[i] + "\nCholesterol: " + cholesterol[i] + "\n\n";
    }
    
    return result;
  }
  
}