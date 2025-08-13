package day06;

public class LampadaTest {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        System.out.println(l1.getEstado());

        l1.ligar();
        System.out.println(l1.getEstado());

        while (l1.getEstado() != Estado.QUEIMADA) {
            l1.desligar();
            l1.ligar();
            System.out.println(l1.getEstado());
        }
        System.out.println(l1.getEstado());

    }
}
