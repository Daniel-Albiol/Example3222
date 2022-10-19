import java.util.Scanner;
public class Example3222 {
    public static void main(String[] argv) {
        double n, y = 0, x;
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        n = input.nextDouble();
        x = n;
        for (int i = 1; i <= 10; i++) {
            y = 0.5 * (x + n / x);
            x = y;
        }
        System.out.println("Result =" + y);
    }
}
