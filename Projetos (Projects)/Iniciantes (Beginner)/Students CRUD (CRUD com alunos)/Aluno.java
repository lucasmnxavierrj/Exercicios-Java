package exercicios;

public class Aluno {
    private String nome;
    //*Todo luno terá um vetor de 4 slots para as notas dos bimestres.
    private double[] nota = new double[4];
    private String matricula;
    //Alteração no método construtor para solicitar sempre as 3 informações.
    public Aluno(String nome, double[] nota, String matricula){
        setMatricula(matricula);
        setNome(nome);
        setNota(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
