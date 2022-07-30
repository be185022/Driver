// I was to create a Monkey class and then complete/update the Driver class
// The one error I had was on Line 276
// Anything annotated with // !!... is my add

// Start
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

  private static ArrayList<Dog> dogList = new ArrayList<Dog>();
  private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
  // Instance variables (if needed)

  public static void main(String[] args) {

    initializeDogList();
    initializeMonkeyList();

    // Add a loop that displays the menu, accepts the users input
    // and takes the appropriate action.
    // For the project submission you must also include input validation
    // and appropriate feedback to the user.
    // Hint: create a Scanner and pass it to the necessary
    // methods
    // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
    // method.

    String quit = "n";

    while (!quit.equalsIgnoreCase("q")) {
      displayMenu();
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("1")) {
        intakeNewDog(scanner);
      } else if (input.equalsIgnoreCase("2")) {
        intakeNewMonkey(scanner);
      } else if (input.equalsIgnoreCase("3")) {
        reserveAnimal(scanner);
      } else if (input.equalsIgnoreCase("4")) {
        printAnimals("dog");
      } else if (input.equalsIgnoreCase("5")) {
        printAnimals("monkey");
      } else if (input.equalsIgnoreCase("6")) {
        printAnimals("available");
      } else if (input.equalsIgnoreCase("q")) {
        quit = input;
      } else {
        System.out.print(
            "Selection Is Invalid. Please Enter A Valid Selection");
      }
    }
  }

  // This method prints the menu options
  public static void displayMenu() {
    System.out.println("\n\n");
    System.out.println("\t\t\t\tRescue Animal System Menu");
    System.out.println("[1] Intake a new dog");
    System.out.println("[2] Intake a new monkey");
    System.out.println("[3] Reserve an animal");
    System.out.println("[4] Print a list of all dogs");
    System.out.println("[5] Print a list of all monkeys");
    System.out.println("[6] Print a list of all animals that are not reserved");
    System.out.println("[q] Quit application");
    System.out.println();
    System.out.println("Enter a menu selection");
  }

  // Adds dogs to a list for testing
  public static void initializeDogList() {
    // BEMERSON: You don't need to create separate variables.  The add() method of an array can just take the creation of the objects directly
    dogList.add(new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019",
    "United States", "intake", false, "United States"));
    dogList.add(new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020",
    "United States", "Phase I", false, "United States"));
    dogList.add(new Dog("Bella", "Chihuahua", "female", "4", "25.6",
    "12-12-2019", "Canada", "in service", true, "Canada"));
  }

  // Adds monkeys to a list for testing
  // Optional for testing
  public static void initializeMonkeyList() {
    monkeyList.add(new Monkey(
      "Joshua", "Marmoset", "5.7", "8.6", "17.9", "male", "2", "14.3",
      "11-08-2019", "United Kingdom", "Phase I", true, "United States"));
    monkeyList.add(new Monkey(
      "Abigail", "Capuchin", "4.8", "9.2", "20.7", "female", "3", "17.8",
      "04-03-2019", "United States", "in service", false, "United Kingdom"));
    monkeyList.add(new Monkey(
      "Isla", "Tamarin", "4.4", "7.8", "17.2", "female", "1", "15.1",
      "06-23-2021", "United States", "intake", false, "United States"));
  }

  // Complete the intakeNewDog method
  // The input validation to check that the dog is not already in the list
  // is done for you
  public static void intakeNewDog(Scanner scanner) {
    System.out.println("What is the dog's name?");
    String name = scanner.nextLine();
    for (Dog dog : dogList) {
      if (dog.getName().equalsIgnoreCase(name)) {
        System.out.println("\n\nThis dog is already in our system\n\n");
        return;
      }
    }

    // Add the code to instantiate a new dog and add it to the appropriate list
    System.out.println("What is the dog's breed?");
    String breed = scanner.nextLine();
    System.out.println("What is the dog's gender?");
    String gender = scanner.nextLine();
    System.out.println("What is the dog's age?");
    String age = scanner.nextLine();
    System.out.println("What is the dog's weight?");
    String weight = scanner.nextLine();
    System.out.println("What is the dog's acquisition date?");
    String acqDate = scanner.nextLine();
    System.out.println("What is the dog's acquisition country?");
    String acqCountry = scanner.nextLine();
    System.out.println("What is the dog's training status?");
    String ts = scanner.nextLine();
    System.out.println("Is the dog reserved?");
    boolean res = scanner.nextBoolean();
    scanner.nextLine();
    System.out.println("What is the dog's in Service Country?");
    String isc = scanner.nextLine();
    dogList.add(new Dog(name, breed, gender, age, weight, acqDate, acqCountry, ts, res, isc));
  }

  // Complete intakeNewMonkey
  // Instantiate and add the new monkey to the appropriate list
  // For the project submission you must also validate the input
  // to make sure the monkey doesn't already exist and the species type is
  // allowed
  public static void intakeNewMonkey(Scanner scanner) {
    System.out.println("What is the monkey's name?");
    String name = scanner.nextLine();
    for (Monkey monkey : monkeyList) {
      if (monkey.getName().equalsIgnoreCase(name)) {
        System.out.println("\n\nThis monkey is already in our system\n\n");
        return;
      }
    }

    System.out.println("What is the monkey's species?");
    String species = scanner.nextLine();
    if (!(species.equalsIgnoreCase("Capuchin")) &&
        !(species.equalsIgnoreCase("Guenon")) &&
        !(species.equalsIgnoreCase("Macaque")) &&
        !(species.equalsIgnoreCase("Marmoset")) &&
        !(species.equalsIgnoreCase("Squirrel Monkey")) &&
        !(species.equalsIgnoreCase("Tamarin"))) {
      System.out.println("\n\nThis monkey's species is not allowed\n\n");

      return;
    }

    // !!Continuing on with Monkey intake method same as Dog!!

    System.out.println("What is the monkey's tail length?");
    String tailLength = scanner.nextLine();
    System.out.println("What is the monkey's height?");
    String height = scanner.nextLine();
    System.out.println("What is the monkey's bodyLength?");
    String bodyLength = scanner.nextLine();
    System.out.println("What is the monkey's gender?");
    String gender = scanner.nextLine();
    System.out.println("What is the monkey's age?");
    String age = scanner.nextLine();
    System.out.println("What is the monkey's weight?");
    String weight = scanner.nextLine();
    System.out.println("What is the monkey's acquisition date?");
    String acqDate = scanner.nextLine();
    System.out.println("What is the monkey's acqusition country?");
    String acqCountry = scanner.nextLine();
    System.out.println("What is the monkey's training status?");
    String ts = scanner.nextLine();
    System.out.println("Is this monkey reserved?");
    boolean res = scanner.nextBoolean();
    scanner.nextLine();
    System.out.println("What is the monkey's In Service Country?");
    String isc = scanner.nextLine();

    monkeyList.add(new Monkey(name, species, tailLength, height, bodyLength, gender, age,
    weight, acqDate, acqCountry, ts, res, isc));
  }

  // Complete reserveAnimal
  // You will need to find the animal by animal type and in service country
  public static void reserveAnimal(Scanner scanner) {
    System.out.println("Enter The Service Animal Type: ");
    String animalType = scanner.nextLine();
    System.out.println("Enter The Country: ");
    String country = scanner.nextLine();

    for (Dog dog : dogList) {
      if (dog.getAnimalType().equalsIgnoreCase(animalType) &&
          dog.getInServiceLocation().equalsIgnoreCase(country)) {
        dog.setReserved(true);
        return;
      }
    }

    for (Monkey monkey : monkeyList) {
      if (monkey.getAnimalType().equalsIgnoreCase(animalType) &&
          monkey.getInServiceLocation().equalsIgnoreCase(country)) {
        monkey.setReserved(true);
        return;
      }
    }

    System.out.println("Animal Type Not Found: " + animalType + ", Location: " + country);
  }

  // Complete printAnimals
  // Include the animal name, status, acquisition country and if the animal is
  // reserved. Remember that this method connects to three different menu items.
  // The printAnimals() method has three different outputs
  // based on the listType parameter
  // dog - prints the list of dogs
  // monkey - prints the list of monkeys
  // available - prints a combined list of all animals that are
  // fully trained ("in service") but not reserved
  // Remember that you only have to fully implement ONE of these lists.
  // The other lists can have a print statement saying "This option needs to be
  // implemented". To score "exemplary" you must correctly implement the
  // "available" list.
  public static void printAnimals(String type) {

    if (type.equalsIgnoreCase("dog")) {
      System.out.println("List of Dogs:");
      for (Dog dog : dogList) {
        System.out.println(dog.toString());
      }
    }
    else if (type.equalsIgnoreCase("monkey")) {
      System.out.println("List of Monkeys:");
      for (Monkey monkey : monkeyList)
        System.out.println(monkey.toString());
    }
    else if (type.equalsIgnoreCase("available")) {
      System.out.println("Dogs In Service And Available:");
      for (Dog dog : dogList) {
        if (dog.getTrainingStatus().equalsIgnoreCase("in service") &&
            !dog.getReserved()) {
          System.out.println(dog.toString());
        }
      }

      System.out.println("Monkeys In Service And Available:");
      for (Monkey monkey : monkeyList) {
        if (monkey.getTrainingStatus().equalsIgnoreCase("in service") &&
            !monkey.getReserved()) {
          System.out.println(monkey.toString());
        }
      }
    }
  }
}
