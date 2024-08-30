package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LambdaStream {

    public static void main(String[] args) {

        //stream - fluxo de dados

         List<Integer> numeros = Arrays.asList(1, 2 ,3 ,4, 5, 6, 7, 8, 9, 10);

         for(int num : numeros){
             System.out.println(num);
         }
        System.out.println("\n");

         //O código acima pode ser substituido por esse, pois a stream recebe um fluxo de dados do array "numeros"
         numeros.stream().forEach(num -> System.out.println(num));
        System.out.println("\n");

         //A diferença é que stream possui muitos outros métodos para podermos trabalhar com os fluxos de dados
        numeros.stream()
                .skip(2)
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.println(num));

        System.out.println("\n");
        numeros.stream()
                .filter(num -> num > 5)
                .map(num -> num * 2) //Usado para transformar os dados. A lista original não é alterada
                .forEach(num -> System.out.println(num));

        //OPERAÇÕES TERMINAIS (COUNT, FOREACH, etc)

        long contador = numeros.stream()
                .filter(num -> num % 2 == 0)
                .count();

        System.out.println("\n");
        System.out.println("Qtd numeros pares: " + contador);

        Optional<Integer> valMinimo = numeros.stream()
                .filter(num -> num % 2 == 0)
                .min(Comparator.naturalOrder());

        System.out.println("\n");
        System.out.println("Menor número par: " + valMinimo.get());

    }
}
