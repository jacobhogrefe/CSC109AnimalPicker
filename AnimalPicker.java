import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validAnimal = false;
        System.out.println("Which animal would you like to see? A dog or cat");
        while (!validAnimal) {
            String animal = input.nextLine();
            if (animal.equalsIgnoreCase("dog")) {
                System.out.println("ASCII_DOG_ART_GOES_HERE");
                validAnimal = true;
            } else if (animal.equalsIgnoreCase("cat")) {
                System.out.println("ASCII_CAT_GOES_HERE");
                validAnimal = true;
            } else {
                System.out.println("Invalid selection! Please try again.");
            }
        }
        input.close();
    }
}