package banco;

import java.util.Scanner;

public class Conta extends Usuario{
    private double saldo;
    boolean logado = false;
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);

    public void cadastrar(){
        System.out.println("--------------------------------");
        System.out.println("CADASTRO DE CLIENTE");
        System.out.println("--------------------------------");
        System.out.println("Insira o nome:");
        setNome(scan2.nextLine());
        System.out.println("Insira o e-mail:");
        setEmail(scan2.nextLine());
        System.out.println("Insira a agência:");
        setAgencia(scan.nextInt());
        System.out.println("Insira a conta:");
        setConta(scan.nextInt());
        System.out.println("Insira a senha:");
        setSenha(scan2.nextLine());
    }
    public void login(){
        System.out.println("--------------------------------");
        System.out.println("LOGIN");
        System.out.println("--------------------------------");
        System.out.println("Insira seu e-mail:");
        String email = scan2.nextLine();
        System.out.println("Insira sua senha:");
        String senha = scan2.nextLine();
        if(email.equals(getEmail()) && senha.equals(getSenha())){
            System.out.println("--------------------------------");
            System.out.println("LOGADO COM SUCESSO!");
            System.out.println("--------------------------------");
            setLogado(true);
            menuLogado();
        }
        else{
            System.out.println("--------------------------------");
            System.out.println("DADOS NÃO ENCONTRADOS. TENTE NOVAMENTE");
            System.out.println("--------------------------------");
            menuDeslogado();
        }
    }
    public void menuLogado(){
        System.out.println("Seja bem-vindo, "+getNome()+". Escolha uma das opções abaixo:\n");
        System.out.println("Digite a - Fazer cadastro");
        System.out.println("Digite b - Fazer login");
        System.out.println("Digite c - Consultar saldo");
        System.out.println("Digite d - Fazer depósito");
        System.out.println("Digite e - Fazer saque");
        System.out.println("Digite f - SAIR");
        char opcao = scan.next().charAt(0);
        switch(opcao){
            case 'a':
                cadastrar();
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
            case 'b':
                login();
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
            case 'c':
                consultaSaldo();
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
            case 'd':
                depositarDinheiro();
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
            case 'e':
                sacarDinheiro();
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
            case 'f':
                return;
            default:
                System.out.println("Escolha inválida, tente novamente.");
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
        }
    }

    public void menuDeslogado(){
        System.out.println("Escolha uma das opções abaixo:\n");
        System.out.println("Digite a - Fazer cadastro");
        System.out.println("Digite b - Fazer login");
        System.out.println("Digite c - Consultar saldo");
        System.out.println("Digite d - Fazer depósito");
        System.out.println("Digite e - Fazer saque");
        System.out.println("Digite f - SAIR");
        char opcao = scan.next().charAt(0);
        switch(opcao){
            case 'a':
                cadastrar();
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
            case 'b':
                login();
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
            case 'c':
                consultaSaldo();
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
            case 'd':
                depositarDinheiro();
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
            case 'e':
                sacarDinheiro();
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
            case 'f':
                return;
            default:
                System.out.println("Escolha inválida, tente novamente.");
                if(logado == true){
                    menuLogado();
                }
                else{
                    menuDeslogado();
                }
                break;
        }
    }

    public void depositarDinheiro(){
        if(logado == true) {
            System.out.println("--------------------------------");
            System.out.println("REALIZAR DEPÓSITO");
            System.out.println("--------------------------------");
            System.out.println("Quanto deseja depositar?");
            double dinheiro = scan.nextDouble();
            saldo += dinheiro;
        }
        else{
            System.out.println("\nVOCÊ NÃO ESTÁ LOGADO.\n");
        }
    }
    public void sacarDinheiro(){
        if(logado == true){
            System.out.println("--------------------------------");
            System.out.println("REALIZAR SAQUE");
            System.out.println("--------------------------------");
            System.out.println("Quanto deseja sacar?");
            double dinheiro = scan.nextDouble();
            saldo -= dinheiro;
        }else{
            System.out.println("\nVOCÊ NÃO ESTÁ LOGADO.\n");
        }

    }
    public void consultaSaldo(){
        if(logado == true) {
            System.out.println("--------------------------------");
            System.out.println("CONSULTAR SALDO");
            System.out.println("--------------------------------");
            System.out.println("Seu saldo é: R$" + getSaldo());
        }
        else{
            System.out.println("\nVOCÊ NÃO ESTÁ LOGADO.\n");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}
