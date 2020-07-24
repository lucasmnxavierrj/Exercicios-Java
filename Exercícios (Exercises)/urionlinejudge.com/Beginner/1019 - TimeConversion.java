import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min= n/60;
        int hours= min/60;
        min = min%60;
        n = n%60;
        System.out.println(hours+":"+min+":"+n);
    }
 
}