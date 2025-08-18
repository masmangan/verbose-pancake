import java.util.ArrayList;

public class ArrayListApp {

    /**
     * Saída esperada:
     * [10,5,15,12,7,19]
     * [10,5,12,7,19]
     * [5,12,7,19]
     * [5,12,7]
     * 
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(10);
        lista.add(5);
        lista.add(15);
        lista.add(12);
        lista.add(7);
        lista.add(19);
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        lista.remove(3);
        System.out.println(lista);
    }
}
