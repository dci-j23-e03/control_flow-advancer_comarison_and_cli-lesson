import java.util.Arrays;
import java.util.Scanner;

public class CLIExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Your full name is: " + fullName);

        System.out.print("Please enter your gender: ");
        String gender = scanner.next();
        scanner.nextLine();
        System.out.println("Your gender is: " + gender);

        System.out.print("Please enter your age: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter your age as a number: ");
            scanner.nextLine();
        }
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your age is: " + age);


        System.out.print("Are you married (true/false)? ");
        while (!scanner.hasNextBoolean()) {
            System.out.print("Are you married? Please enter true or false: ");
            scanner.nextLine();
        }
        boolean isMarried = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Married: " + isMarried);
    }
}
