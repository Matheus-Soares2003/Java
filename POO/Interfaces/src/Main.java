import classes.Circulo;
import classes.Retangulo;
import classes.Triangulo;
import interfaces.FormaGeometrica;

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
        /*FormaGeometrica forma = new FormaGeometrica(); */

        FormaGeometrica forma1 = new Retangulo(4, 10);
        FormaGeometrica forma2 = new Circulo(5);
        //FormaGeometrica forma3 = new Triangulo(2, 10); Triangulo não implementa a interface, portanto dará erro

        escreverArea(forma1);
        escreverArea(forma2);
        System.out.println(forma1.calcularArea());
        System.out.println(forma2.calcularArea());

    }

    //Interfaces podem ser usadas como "tipo genérico". Quem implementar essa interface pode usar o metodo calcular área
    public static void escreverArea(FormaGeometrica forma) {
        String nomeForma = forma.getClass().getSimpleName();
        System.out.println("A área do " + nomeForma + " é " + forma.calcularArea());
    }

}