package figuras;

public class Circulo extends FiguraBidimensional{
    private int raio;

    public Circulo(int centrox, int centroy, int raio) {
        super(centrox, centroy);
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    public double perimetro() {
        return 2 * Math.PI * raio;
    }


    @Override
    public String toString() {
        return String.format("%s raio=%d", 
        super.toString(), raio);
    }
}
