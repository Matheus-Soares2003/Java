package Models;

public class Turma {

    private String nome;
    private String codigo;
    private int capacidade;

    public Turma() {}

    public Turma(String nome, String codigo, int capacidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void listarInfos() {
        System.out.println(
                "\nNome: " + this.nome +
                "\nCodigo: " + this.codigo +
                "\nCapacidade: " + this.capacidade + " alunos"
        );
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\nCodigo: " + this.codigo +
                "\nCapacidade: " + this.capacidade + " alunos";
    }
}
