import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");
        final double pi = 3.14159;
        double radius = scan.nextDouble();
        double volume = (4.0/3)*pi*Math.pow(radius,3);
        System.out.println("VOLUME = "+df.format(volume));
    }

}