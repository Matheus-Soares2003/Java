package classes;

import interfaces.FormaGeometrica;

public class Circulo implements FormaGeometrica {

    private float raio;
    private final float PI = 3.14f;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public Circulo() {}

    @Override
    public float calcularArea() {
        return this.PI * this.raio * this.raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
