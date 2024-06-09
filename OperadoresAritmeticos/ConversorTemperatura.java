package OperadoresAritmeticos;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float temperaturaC, temperaturaF;

        System.out.print("Temperatura em °C: ");
        temperaturaC = scan.nextFloat();

        //C / 5 = (F - 32) / 9
        temperaturaF = ((9f * temperaturaC) / 5f) + 32f;
        
        System.out.println(String.format("A temperatura de %.2f°C corresponde a %.2f°F!", temperaturaC, temperaturaF));

        scan.close();

    }
}
