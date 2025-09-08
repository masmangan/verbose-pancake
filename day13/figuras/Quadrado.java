package figuras;

public class Quadrado extends FiguraBidimensional {
    
    private int lado;

    public Quadrado(int centrox, int centroy, int lado) {
        super(centrox, centroy);
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }    

    @Override
    public String toString() {
        return String.format("%s lado=%d", 
        super.toString(), lado);
    }
}
