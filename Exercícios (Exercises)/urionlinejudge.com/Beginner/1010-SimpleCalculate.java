import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        int codigoProduto = 0;
        int unidadesProduto = 0;
        double precoUnitarioProduto = 0;
        double total = 0;

        for(int cont=1;cont<=2;cont++){
            codigoProduto = scan.nextInt();
            unidadesProduto = scan.nextInt();
            precoUnitarioProduto = scan.nextDouble();
            total = total+(unidadesProduto * precoUnitarioProduto);
        }
        System.out.println("VALOR A PAGAR: R$ "+df.format(total));
    }

}