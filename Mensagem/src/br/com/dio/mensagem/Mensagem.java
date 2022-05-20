package br.com.dio.mensagem;

public class Mensagem {
    public static void obterMensagem(int horas){
        if (horas >= 5 && horas <= 12){
            System.out.println("Bom dia!");
        } else if (horas > 12 && horas <= 17){
            System.out.println("Boa Tarde!");
        } else if (horas > 17 || horas <= 4){
            System.out.println("Boa noite!");
        } else {
            System.out.println("Hora inválida!");
        }
    }
}
