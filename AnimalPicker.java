import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which animal would you like to see? A dog or cat");
        String animal = input.nextLine();
        if (animal.equalsIgnoreCase("dog")) {
            System.out.println("ASCII_DOG_ART_GOES_HERE");
        } else if (animal.equalsIgnoreCase("cat")) {
            System.out.println("ASCII_CAT_GOES_HERE");
        } else {
            System.out.println("Invalid selection!");
        }
        input.close();
    }
}