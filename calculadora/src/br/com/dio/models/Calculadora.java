package br.com.dio.models;

public class Calculadora {

    //Métodos
    public double Somar(double num1, double num2){
        return num1 + num2;
    }

    public double Subtrair(double num1, double num2){
        return num1 - num2;
    }

    public double Multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public double Dividir(double num1, double num2){
        if (num2 == 0){
            System.out.println("Impossível dividir por 0");
            return 0;
        } else {
            return num1 / num2;
        }

    }
}
