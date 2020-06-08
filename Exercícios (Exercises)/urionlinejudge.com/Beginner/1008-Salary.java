import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        int employeeNumber = scan.nextInt();
        int workedHours = scan.nextInt();
        double salary = scan.nextDouble();
        salary *= workedHours;

        System.out.println("NUMBER = "+employeeNumber+"\nSALARY = U$ "+ df.format(salary));
    }

}