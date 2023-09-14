import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* JFrame frame = new JFrame();
        frame.setLayout();
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the value of what number in the fibonacci sequence you want to know. :  ");
            int n = scanner.nextInt();
            int result = BaseOfMath.fib(n);
            System.out.println("Value of " + n + "th number in the fibonacci sequence is : " + result);

    }
}