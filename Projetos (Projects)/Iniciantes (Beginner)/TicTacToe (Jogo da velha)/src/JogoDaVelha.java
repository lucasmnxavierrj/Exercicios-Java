import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Criando o tabuleiro
        char[][] tabuleiro = {{'1','|','2','|','3'}
                             ,{'-','+','-','+','-'}
                             ,{'4','|','5','|','6'}
                             ,{'-','+','-','+','-'}
                             ,{'7','|','8','|','9'}};
        //Metodo de ipressão do tabuleiro em 'Matriz'
        imprimirTabuleiro(tabuleiro);
        //Ciclo que envolve o metodo de colocar Peça e o método de inteligencia do jogo
        for(int i = 0;i<9;i++){
            System.out.println("Insira um número de 1 a 9:");
            int opcao = scan.nextInt();
            //decrementará 1 do contador sempre que o método de colocarPeça indicar que o campo já está ocupado.
            if(colocarPeça(tabuleiro,opcao,i) == true){
                i--;
            }
            //Inicializará a inteligência a partir da 4º rodada
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
    public static boolean colocarPeça(char[][] tabuleiro, int opcao, int contador){
        char peça = ' ';
        boolean ocupado = false;
        //Esse if determina qual peça será jogada, se o contador for par, é X, se for ímpar é O
        if(contador%2==0){
            peça = 'X';
        }
        else{
            peça = 'O';
        }
        //O Switch é quem vai determinar onde a peça de fato vai baseado na posição escolhida pelo jogador
        switch(opcao){
            case 1:
                // Se na posição escolhida já tiver um X ou um O o método não colocará a peça e retornará
                //a varíavel boolean ocupado como true
                //O que diminuirá 1 do contador, fazendo com que a próxim jogada seja do mesmo tipo de peça.
                if(tabuleiro[0][0] != 'X' && tabuleiro[0][0] != 'O'){
                    tabuleiro[0][0] = peça;
                    break;
                }else{
                    System.out.println("Este campo já está ocupado, tente novamente.");
                    ocupado = true;
                    return ocupado;
                }

            case 2:
                if(tabuleiro[0][2] != 'X' && tabuleiro[0][2] != 'O'){
                    tabuleiro[0][2] = peça;
                    break;
                }else{
                    System.out.println("Este campo já está ocupado, tente novamente.");
                    ocupado = true;
                    return ocupado;
                }
            case 3:
                if(tabuleiro[0][4] != 'X' && tabuleiro[0][4] != 'O'){
                    tabuleiro[0][4] = peça;
                    break;
                }else{
                    System.out.println("Este campo já está ocupado, tente novamente.");
                    ocupado = true;
                    return ocupado;
                }
            case 4:
                if(tabuleiro[2][0] != 'X' && tabuleiro[2][0] != 'O'){
                    tabuleiro[2][0] = peça;
                    break;
                }else{
                    System.out.println("Este campo já está ocupado, tente novamente.");
                    ocupado = true;
                    return ocupado;
                }
            case 5:
                if(tabuleiro[2][2] != 'X' && tabuleiro[2][2] != 'O'){
                    tabuleiro[2][2] = peça;
                    break;
                }else{
                    System.out.println("Este campo já está ocupado, tente novamente.");
                    ocupado = true;
                    return ocupado;
                }
            case 6:
                if(tabuleiro[2][4] != 'X' && tabuleiro[2][4] != 'O'){
                    tabuleiro[2][4] = peça;
                    break;
                }else{
                    System.out.println("Este campo já está ocupado, tente novamente.");
                    ocupado = true;
                    return ocupado;
                }
            case 7:
                if(tabuleiro[4][0] != 'X' && tabuleiro[4][0] != 'O'){
                    tabuleiro[4][0] = peça;
                    break;
                }else{
                    System.out.println("Este campo já está ocupado, tente novamente.");
                    ocupado = true;
                    return ocupado;
                }
            case 8:
                if(tabuleiro[4][2] != 'X' && tabuleiro[4][2] != 'O'){
                    tabuleiro[4][2] = peça;
                    break;
                }else{
                    System.out.println("Este campo já está ocupado, tente novamente.");
                    ocupado = true;
                    return ocupado;
                }
            case 9:
                if(tabuleiro[4][4] != 'X' && tabuleiro[4][4] != 'O'){
                    tabuleiro[4][4] = peça;
                    break;
                }else{
                    System.out.println("Este campo já está ocupado, tente novamente.");
                    ocupado = true;
                    return ocupado;
                }
            default:
                System.out.println("Valor não permitido, selecione um campo de 1 a 9");
                return ocupado;

        }
        imprimirTabuleiro(tabuleiro);
        return ocupado;
    }
    public static int inteligencia(char[][] tabuleiro, int contador){
        if(tabuleiro[0][0]==tabuleiro[0][2] && tabuleiro[0][2]==tabuleiro[0][4] ||
           tabuleiro[2][0]==tabuleiro[2][2] && tabuleiro[2][2]==tabuleiro[2][4] ||
           tabuleiro[4][0]==tabuleiro[4][2] && tabuleiro[4][2]==tabuleiro[4][4] ||
           tabuleiro[0][0]==tabuleiro[2][2] && tabuleiro[2][2]==tabuleiro[4][4] ||
           tabuleiro[0][4]==tabuleiro[2][2] && tabuleiro[2][2]==tabuleiro[4][0] ||
           tabuleiro[0][0]==tabuleiro[2][0] && tabuleiro[2][0]==tabuleiro[4][0] ||
           tabuleiro[0][2]==tabuleiro[2][2] && tabuleiro[2][2]==tabuleiro[4][2] ||
           tabuleiro[0][4]==tabuleiro[2][4] && tabuleiro[2][4]==tabuleiro[4][4]){
           contador = 10;
           System.out.println("------------------------------");
           System.out.println("VITÓRIA!");
           System.out.println("------------------------------");
        }
        return contador;
    }

}
