package Streams;

import java.util.Optional;

public class TratandoNulos {

    public static void main(String[] args) {

        String texto = "5";
        Optional<Integer> numero = converteEmNumero(texto);

        numero.ifPresent(num -> System.out.println(num));
    }

    public static Optional<Integer> converteEmNumero(String numeroStr) {
        try {
            Integer numeroInt = Integer.valueOf(numeroStr);
            return Optional.of(numeroInt);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
