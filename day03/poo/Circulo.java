package poo;

import static java.lang.Math.*;


public class Circulo {
    
    private double raio;

    public Circulo(double raio) {
        if (raio <= 0.0)
            throw new IllegalArgumentException("Raio inválido!");
        this.raio = raio;
    }

    public double getArea() {
        return PI * pow(raio, 2.0);
    }
}
