import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        String name = scan.nextLine();
        double salarioBruto = scan.nextDouble();
        double vendasFeitas = scan.nextDouble();
        vendasFeitas = (vendasFeitas * 0.15) + salarioBruto;

        System.out.println("TOTAL = R$ "+df.format(vendasFeitas));

    }

}