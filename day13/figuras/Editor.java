package figuras;

public final class Editor {

    private Editor() {

    }
    
    public static void main(String[] args) {
        System.out.println("Exemplo das figuras!");

        FiguraBidimensional c1 = new Circulo(4,5,6);
        System.out.println(c1);

        FiguraBidimensional q1 = new Quadrado(4,5,6);
        System.out.println(q1);

    }
    
}
