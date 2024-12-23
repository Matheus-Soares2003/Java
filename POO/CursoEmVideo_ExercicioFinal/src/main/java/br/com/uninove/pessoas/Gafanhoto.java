package br.com.uninove.pessoas;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo, String login, int totAssistido) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){
        this.totAssistido++;
    };

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                " login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
