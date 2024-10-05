package classes;

public class Triangulo {

    private float base;
    private float lado1;
    private float lado2;
    private float altura;

    public Triangulo(float base, float lado1, float lado2, float altura) {
        this.base = base;
        this.lado2 = lado2;
        this.lado1 = lado1;
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float calcularArea() {
        return (this.base * this.altura) / 2;
    }
}
