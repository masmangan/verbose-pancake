public class App {

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
        ListaInt lista = new ListaInt();
        lista.insere(10);
        lista.insere(5);
        lista.insere(15);
        lista.insere(12);
        lista.insere(7);
        lista.insere(19);
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        lista.remove(3);
        System.out.println(lista);
    }
}
