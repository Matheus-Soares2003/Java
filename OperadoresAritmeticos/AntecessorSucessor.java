package OperadoresAritmeticos;
import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        int sucessor = numero + 1;
        int antecessor = numero - 1;

        System.out.println("Analisando o número " + numero + ", seu antecessor é " + antecessor + " e seu sucessor é " + sucessor);

        scan.close();
    }
}
