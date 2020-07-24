import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int aux = n;
        System.out.printf("%d\n", n);
        System.out.print(n/100 + " nota(s) de R$ 100,00\n");
        n%=100;
        System.out.print(n/50 + " nota(s) de R$ 50,00\n");
        n%=50;
        System.out.print(n/20 + " nota(s) de R$ 20,00\n");
        n%=20;
        System.out.print(n/10 + " nota(s) de R$ 10,00\n");
        n%=10;
        System.out.print(n/5 + " nota(s) de R$ 5,00\n");
        n%=5;
        System.out.print(n/2 + " nota(s) de R$ 2,00\n");
        n%=2;
        System.out.print(n + " nota(s) de R$ 1,00\n");
    }
}