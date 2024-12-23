package Models;

public class Aluno {
    private String nome;
    public int cont;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        cont++;
        this.nome = nome;
    }


}
