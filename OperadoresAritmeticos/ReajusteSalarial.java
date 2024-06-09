package OperadoresAritmeticos;

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double salario, reajuste;

        System.out.print("Salário do funcionário: R$");
        salario = scan.nextDouble();

        //Aumento de 15%
        reajuste = salario * 1.15; //Ou salario + salario * 0.15

        System.out.println(String.format("Um funcionário que ganhava R$%.2f, com 15%% de aumento, passa a receber R$%.2f", salario, reajuste));

        scan.close();

    }
}
