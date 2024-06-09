package OperadoresAritmeticos;
import java.util.Scanner;

public class MediaAritmetica {
 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Primeira nota do aluno: ");
        float nota1 = scan.nextFloat();
        
        System.out.print("Segunda nota do aluno: ");
        float nota2 = scan.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println(String.format("A média entre %.2f e %.2f é igual a %.2f", nota1, nota2, media));

        scan.close();

    }

}
