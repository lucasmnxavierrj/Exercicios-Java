import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");
        int tempo = scan.nextInt();
        int velocMedia = scan.nextInt();
        int distancia = velocMedia * tempo;
        double gastoGasolina = distancia / 12.0;
        System.out.println(df.format(gastoGasolina));
    }
 
}