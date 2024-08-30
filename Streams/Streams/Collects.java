package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collects {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2 ,3 ,4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList()); //coleta os numeros pares e joga em uma nova lista

        System.out.println(numerosPares);

        Map<String, List<Integer>> numerosAgrupados = numeros.stream()
                .map(num -> num * 3)
                .collect(Collectors.groupingBy(num -> num % 2 == 0? "par" : "ímpar")); //agrupa números pares em um mapa com base no retorno da função lambda

        System.out.println(numerosAgrupados);

        String numerosConcatenatos = numeros.stream()
                .map(num -> String.valueOf(num))
                .collect(Collectors.joining(" - "));

        System.out.println(numerosConcatenatos);

    }
}
