import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double media = ((a*2)+(b*3)+(c*5))/10;
        System.out.println("MEDIA = "+df.format(media));

    }

}