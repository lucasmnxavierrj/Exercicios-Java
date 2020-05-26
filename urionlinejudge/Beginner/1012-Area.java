import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        final double pi = 3.14159;

        double areaTriangulo = (a*c)/2;
        double areaCirculo = pi * (c*c);
        double areaTrapezio = ((a+b)*c)/2;
        double areaQuadrado = b*b;
        double areaRetangulo = a*b;

        System.out.println("TRIANGULO: "+df.format(areaTriangulo)+"\nCIRCULO: "+df.format(areaCirculo)+"\nTRAPEZIO: "+df.format(areaTrapezio)+"\nQUADRADO: "+df.format(areaQuadrado)+"\nRETANGULO: "+df.format(areaRetangulo));
    }

}