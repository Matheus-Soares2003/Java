package classes;

import interfaces.FormaGeometrica;

public class Retangulo implements FormaGeometrica {

    private float altura;
    private float largura;

    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo() {}

    @Override
    public float calcularArea() {
        return this.altura * this.largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
}
