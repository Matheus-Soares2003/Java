package OperadoresAritmeticos;

import java.util.Scanner;

public class AluguelCarros {
    public static void main(String[] args) {

        int dias; 
        double kmRodado, preco;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Qtd. Dias Alugados: ");
        dias = scan.nextInt();

        System.out.print("KMs Rodados: ");
        kmRodado = scan.nextDouble();

        //60 reais por dia e 15 centavos por km rodado
        preco = (60 * dias) + (0.15 * kmRodado);

        System.out.println("O total a pagar é de R$" + String.format("%.2f", preco));

        scan.close();

    }
}
