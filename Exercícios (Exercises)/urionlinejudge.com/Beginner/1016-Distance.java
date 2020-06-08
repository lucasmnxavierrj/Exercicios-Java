import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int distancia = scan.nextInt();
        int tempo = distancia *2;
        System.out.println(tempo+" minutos");
 
    }
 
}