import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0000");
        final double PI = 3.14159;
        double r = scan.nextDouble();
        double a = PI*(r*r);
        System.out.println("A="+df.format(a));

    }

}