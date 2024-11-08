public class DataRunner {
  public static void main(String[] args) {

    UserStory userStory = new UserStory("names.txt", "calories.txt", "fats.txt", "proteins.txt", "cholesterol.txt");

    // Print out using toString() method to see the data from txt files
    // System.out.println(userStory);

    System.out.println("Highest Cal / Highest Fat");
    userStory.findHighCalHighFat();
    
    System.out.println("Highest Cal / Lowest Chol");
    userStory.findHighProteinsLowChol();
      
  }
}