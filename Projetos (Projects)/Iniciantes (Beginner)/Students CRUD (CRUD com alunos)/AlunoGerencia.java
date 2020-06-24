package exercicios;

import java.util.Scanner;

public class AlunoGerencia {
    //A Classe Aluno gerencia terá um vetor de objetos Aluno, de tamanho não definido, e que irá variar
    //com a quantidade de iterações
    Aluno[] alunos = new Aluno[0];

    public static void main(String[] args) {
        try {
            AlunoGerencia ag = new AlunoGerencia();
            Scanner scanChar = new Scanner(System.in);
            char opcao = ' ';
            boolean liberado = false;
            while (opcao != 'e') {
                System.out.println("-----------");
                System.out.println("Digite 'a' para inserir um novo aluno");
                System.out.println("Digite 'b' para atualizar os dados de um aluno");
                System.out.println("Digite 'c' para remover um aluno");
                System.out.println("Digite 'd' para visualizar os alunos cadastrados");
                System.out.println("Digite 'e' para sair do programa");

                System.out.println("-----------");
                opcao = scanChar.next().charAt(0);
                switch (opcao) {
                    case 'a':
                        ag.inserirAluno(ag.receberNome(), ag.receberNotas(), ag.receberMatricula());
                        liberado = true;
                        break;
                    case 'b':
                        if (liberado == true) {
                            ag.atualizarAlunos(ag.receberMatricula());
                        } else {
                            System.out.println("Nenhum aluno foi inserido ainda. Digite 'a' para inserir um aluno.");
                        }

                        break;
                    case 'c':
                        if (liberado == true) {
                            ag.removerAlunos(ag.receberMatricula());
                        } else {
                            System.out.println("Nenhum aluno foi inserido ainda. Digite 'a' para inserir um aluno.");
                        }
                        //Caso após remover o aluno, o vetor alunos fique vazio, essa condição proibirá o uso das outras opções do menu
                        if (ag.alunos.length == 0) {
                            liberado = false;
                        }
                        break;
                    case 'd':
                        if (liberado == true) {
                            ag.mostrarAlunos();
                        } else {
                            System.out.println("Nenhum aluno foi inserido ainda. Digite 'a' para inserir um aluno.");
                        }

                        break;
                    case 'e':
                        System.out.println("Tem certeza que deseja sair? Todos os dados serão perdidos.");
                        System.out.println("s = sim\n n = não");
                        opcao = scanChar.next().charAt(0);
                        if (opcao == 's') {
                            opcao = 'e';
                        } else {
                            opcao = ' ';
                        }

                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                        break;

                }
            }
        }catch (Exception e){
            System.out.println("Erro encontrado. Reinicie a aplicação.");
        }
    }
    //Método para solicitar preenchimento da matrícula por parte do usuario
    public String receberMatricula(){
        Scanner scanLine = new Scanner(System.in);
        String matricula;
        System.out.println("Insira o código de matrícula: ");
        matricula = scanLine.nextLine();
        return matricula;
    }
    //Método para solicitar preenchimento das 4 notas por parte do usuario
    public double[] receberNotas(){
        Scanner scan = new Scanner(System.in);
        double[] n = new double[4];
        for(int i=0;i<n.length;i++){
            System.out.println("Digite a nota do "+(i+1)+"° bimestre: ");
            n[i] = scan.nextDouble();
        }
        return n;
    }
    //Método para solicitar preenchimento do nome parte do usuario
    public String receberNome(){
        Scanner scanLine = new Scanner(System.in);
        String name;
        System.out.println("Insira o nome do aluno:");
        name = scanLine.nextLine();
        return name;
    }
    //Método para criar um aluno no vetor de objeto Aluno instanciado anteriormente.
    public void inserirAluno(String nome, double[] notas, String matricula){
        //Caso seja o primeiro objeto, irá criar um vetor com um slot apenas.
        if(alunos.length == 0){
            alunos = new Aluno[1];
            alunos[0] = new Aluno(nome, notas, matricula);
        }else{
            //porém, já haja um objeto Aluno no vetor, os dados serão copiados para o vetor backup
            //e em seguida o vetor alunos será recriado com a capacidade de slots aumentada em +1
            //e então os dados copiados para o backup serão trazidos de volta, sobrando assim apenas um ultimo slot
            //disponivel
            Aluno[] backup = alunos;
            alunos = new Aluno[backup.length+1];
            for(int i =0;i<backup.length;i++){
                alunos[0]=backup[0];
            }
            //e esse ultimo slot disponivel receberá um novo aluno
            alunos[backup.length]= new Aluno(nome, notas, matricula);
        }
    }
    //método para exibir na tela todos os objetos Aluno dentro do vetor de objetos alunos
    //foi utilizado um foreach para facilitar o codigo
    public void mostrarAlunos(){
        int i=1;
        for(Aluno aluno : alunos){
            System.out.println(i+"°"+" Aluno:");
            System.out.println("Nome: "+aluno.getNome());
            int j=1;
            for(double n : aluno.getNota()){
                System.out.println("Nota do "+j+"º bimestre: "+n);
                j++;
            }
            System.out.println("Matricula: "+aluno.getMatricula());
            i++;
            System.out.println("---------");
        }
    }
    //este metodo de remoção de um objeto Aluno no vetor de objetos alunos segue o mesmo raciocinio do
    //metodo de inserção: o endereço de memoria de alunos é copiado para o vetor backup, em seguida,
    //é rodado dentro de um ciclo a copia de objeto por objeto, contanto que a matricula não seja igual à
    //informada pelo usuario, neste caso, esse objeto não é copiado,
    //dessa forma o vetor backup fica com sempre -1 slots do que o vetor alunos
    //e ao terminar a cópia para backup, o vetor alunos é recriado com -1 slots e o endereço da memoria de
    //backup é copiado para alunos.

    public void removerAlunos(String matricula){
        Aluno[] backup = new Aluno[alunos.length-1];
        int j=0;
        for(int i=0;i<alunos.length;i++){
            if(!alunos[i].getMatricula().equalsIgnoreCase(matricula)){
                backup[j]=alunos[i];
                j++;
            }
        }
        alunos = backup;
    }
    //será informado a matricula do aluno, e caso seja encontrado um objeto com o mesmo numero de matricula,
    //será disponibilizado a alteração de todas as variaveis deste objeto
    public void atualizarAlunos(String matricula){
        // variavel para controlar se foi encontrado algum aluno, e caso não seja encontrado, para retornar
        //uma mensagem
        boolean encontrado = false;
        for(int i=0;i<alunos.length;i++){
            if(alunos[i].getMatricula().equalsIgnoreCase(matricula)){
                alunos[0].setNome(receberNome());
                alunos[0].setNota(receberNotas());
                alunos[0].setMatricula(receberMatricula());
                i=alunos.length;
                encontrado = true;
            }
        }
        if(encontrado == false){
            System.out.println("Não foram encontrados alunos com este número de matrícula, tente novamente.");
        }
    }
}
