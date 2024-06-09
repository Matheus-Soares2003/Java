package OperadoresAritmeticos;
import java.util.Scanner;
import java.lang.Math;

public class Operacoes {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        int dobro = numero * 2;
        int triplo = numero * 3;
        float raiz = (float) Math.sqrt(numero);

        System.out.println("O dobro de " + numero + " é " + dobro);
        System.out.println("O triplo de " + numero + " é " + triplo);
        System.out.println("A raiz quadrada de " + numero + " é " + String.format("%.2f", raiz));

        scan.close();

    }
}
