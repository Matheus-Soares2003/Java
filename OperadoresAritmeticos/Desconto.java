package OperadoresAritmeticos;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Preço do produto: R$");
        float preco = scan.nextFloat();

        //desconto de 5%
        float desconto = preco * 0.95f;

        System.out.println(String.format("O produto que custava R$%.2f com desconto de 5%% vai custar R$%.2f", preco, desconto));

        scan.close();

    }
}
