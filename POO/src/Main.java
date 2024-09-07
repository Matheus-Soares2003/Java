import classes.Circulo;
import classes.Retangulo;
import classes.Triangulo;
import interfaces.IFormaGeometrica;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(10);
        Retangulo ret = new Retangulo(3, 9);
        Triangulo triangulo = new Triangulo(3, 5);

        escreverArea(circulo);
        escreverArea(ret);

        //Essa linha vai dar erro já que triângulo não implementa o metodo calcularArea da interface IFormaGeometrica
        /*escreverArea(triangulo);*/

        //Essa também dará erro já que não é possível instaciar interfaces
        /*IFormaGeometrica forma = new IFormaGeometrica(); */

    }

    //Interfaces podem ser usadas como "tipo genérico". Quem implementar essa interface pode usar o metodo calcular área
    public static void escreverArea(IFormaGeometrica forma) {
        String nomeForma = forma.getClass().getSimpleName();
        System.out.println("A área do " + nomeForma + " é " + forma.calcularArea());
    }

}