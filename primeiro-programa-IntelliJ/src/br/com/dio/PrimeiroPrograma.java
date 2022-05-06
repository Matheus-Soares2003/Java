package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!");
        System.out.println(a + "+" + b + "=" + (a+b));*/

        Gato gato = new Gato();
        gato.setCor("Branco");
        gato.setNome("Frajola");
        gato.setIdade(5);

        System.out.println(gato);
    }
}
