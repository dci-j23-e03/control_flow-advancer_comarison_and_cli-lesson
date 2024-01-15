import java.util.Scanner;

public class NewLineCharacterProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the phrase you like: ");
        String phrase = scanner.nextLine();

        System.out.print("Please enter the sport you like: ");
        String sport = scanner.nextLine();

        System.out.println("Number: " + number + " Phrase: " + phrase + " Sport: " + sport);
    }
}
