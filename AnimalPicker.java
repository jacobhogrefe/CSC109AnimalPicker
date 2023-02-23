import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validAnimal = false;
        while (!validAnimal) {
            System.out.println("Which animal would you like to see? A dog or cat");
            String animal = input.nextLine();
            if (animal.equalsIgnoreCase("dog")) {
                showASCIIArt(1);
                validAnimal = true;
            } else if (animal.equalsIgnoreCase("cat")) {
                showASCIIArt(0);
                validAnimal = true;
            } else {
                System.out.println("Invalid selection! Please try again.");
            }
        }
        input.close();
    }

    public static void showASCIIArt(int animal) {
        File animalFile = null;
        if (animal == 0) {
            animalFile = new File("cat.txt");
        } else if (animal == 1) {
            animalFile = new File("dog.txt");
        }
        try {
            Scanner scanner = new Scanner(animalFile);
            boolean endOfFile = false;
            while (!endOfFile) {
                if (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                } else {
                    endOfFile = true;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}