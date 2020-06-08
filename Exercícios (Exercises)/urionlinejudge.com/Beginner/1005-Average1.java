import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00000");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double media = ((a*3.5)+(b*7.5))/(3.5+7.5);
        System.out.println("MEDIA = "+df.format(media));
    }

}