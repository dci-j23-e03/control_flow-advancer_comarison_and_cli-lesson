public class Main {
    public static void main(String[] args) {

        if (5 - 10 > 0) {
            System.out.println("We are in the if statement");
        } else {
            System.out.println("We are in the else statement");
        }

        if (4 * 10 - 11 > (3 - 10) * 2) {
            System.out.println("We are in the if statement");
        }

        // ternary operator
        int num = 8;
        String msg = "";
        if (num > 10) {
            msg = "Number is greater than 10";
        } else {
            msg = "Number is less than or equal to 10";
        }
        System.out.println("Message value: " + msg);

        System.out.println(num > 10 ? "Number is greater than 10" : "Number is less than or equal to 10");

        // Conditional AND (&&)
        if (5 > 3 && 5 > 4) {
            System.out.println("5 is greater than 3 and 4");
        } else if (5 > 3 && 5 < 4) {
            System.out.println("5 is only greater than 3");
        } else if (5 > 4 && 5 < 3) {
            System.out.println("5 is only greater than 4");
        }

        // Conditional OR (||)
        num = 10;
        if (num < 10 || num == 10) {
            System.out.println("Number is less than or equal to 10");
        } else {
            System.out.println("Number is greater than 10");
        }

        // unary operators
        int number = -30;
        System.out.printf("Value of number: %d%n", number);
        number++;
        System.out.printf("Value of number: %d%n", number);
        number--;
        System.out.printf("Value of number: %d%n", number);
        System.out.println("True inverted is " + !true);

        // Increment/Decrement prefix and postfix variants
        int x = 10;
        int y = ++x;
        System.out.println("Value of x is " + x);
        System.out.println("Value of y is " + y);

        int a = 10;
        int b = a++;
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
    }
}











