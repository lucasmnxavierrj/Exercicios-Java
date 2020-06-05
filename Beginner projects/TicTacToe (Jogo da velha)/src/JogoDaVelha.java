import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] tabuleiro = {{'1','|','2','|','3'}
                             ,{'-','+','-','+','-'}
                             ,{'4','|','5','|','6'}
                             ,{'-','+','-','+','-'}
                             ,{'7','|','8','|','9'}};
        imprimirTabuleiro(tabuleiro);
        for(int i = 0;i<9;i++){
            System.out.println("Insira um número de 1 a 9:");
            int opcao = scan.nextInt();
            colocarPeça(tabuleiro,opcao,i);
            if(i>=4){
                i = inteligencia(tabuleiro,i);
            }
            else if(i==9){
                System.out.println("Deu velha!");
            }
        }

    }
    public static void imprimirTabuleiro(char[][] tabuleiro){
        for(char[] a : tabuleiro){
            for(char b : a){
                System.out.print(b);
            }
            System.out.println();
        }
    }
    public static void colocarPeça(char[][] tabuleiro, int opcao, int contador){
        char peça = ' ';
        if(contador%2==0){
            peça = 'X';
        }
        else{
            peça = 'O';
        }
        switch(opcao){
            case 1:
                tabuleiro[0][0] = peça;
                break;
            case 2:
                tabuleiro[0][2] = peça;
                break;
            case 3:
                tabuleiro[0][4] = peça;
                break;
            case 4:
                tabuleiro[2][0] = peça;
                break;
            case 5:
                tabuleiro[2][2] = peça;
                break;
            case 6:
                tabuleiro[2][4] = peça;
                break;
            case 7:
                tabuleiro[4][0] = peça;
                break;
            case 8:
                tabuleiro[4][2] = peça;
                break;
            case 9:
                tabuleiro[4][4] = peça;
                break;
            default:
                System.out.println("Valor não permitido, selecione um campo de 1 a 9");
                break;

        }
        imprimirTabuleiro(tabuleiro);
    }
    public static int inteligencia(char[][] tabuleiro, int contador){
        if(tabuleiro[0][0]==tabuleiro[0][2] && tabuleiro[0][2]==tabuleiro[0][4] ||
           tabuleiro[2][0]==tabuleiro[2][2] && tabuleiro[2][2]==tabuleiro[0][4] ||
           tabuleiro[4][0]==tabuleiro[4][2] && tabuleiro[4][2]==tabuleiro[0][4] ||
           tabuleiro[0][0]==tabuleiro[2][2] && tabuleiro[2][2]==tabuleiro[4][4] ||
           tabuleiro[0][4]==tabuleiro[2][2] && tabuleiro[2][2]==tabuleiro[4][0]){
           contador = 10;
           System.out.println("Vitória!");
        }
        return contador;
    }

}
