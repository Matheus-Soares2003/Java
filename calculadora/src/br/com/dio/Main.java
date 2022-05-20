package br.com.dio;

import br.com.dio.models.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        //Importando as classes
        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Primeiro número: ");
        double n1 = teclado.nextDouble();
        System.out.println("Segundo número: ");
        double n2 = teclado.nextDouble();

        //Chamando os métodos
        double soma = calculadora.Somar(n1, n2);
        double subtracao = calculadora.Subtrair(n1, n2);
        double mult = calculadora.Multiplicar(n1, n2);
        double dividir = calculadora.Dividir(n1, n2);
        System.out.println("Soma: "+ soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + dividir);
    }
}
