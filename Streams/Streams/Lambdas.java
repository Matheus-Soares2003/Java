package Streams;


public class Lambdas {

    public static void main(String[] args) {

        //Funções Lambdas

        //SAM - Single Abstract Method
        //Qualquer interface que tenha apenas um métodh abstrato

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Olá Mundo!");
            }
        }).start();

        //O código acima pode ser substituido pela expressão lambda abaixo pois Runnable segue o padrão do SAM;
        new Thread(() -> System.out.println("Olá Mundo!")).start();

    }
}
