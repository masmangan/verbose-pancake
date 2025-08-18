public class ListaInt {
    private static final int CAPACIDADE = 100;
    private final int[] base;
    private int proxLivre;

    public ListaInt() {
        base = new int[CAPACIDADE];
        proxLivre = 0;
    }

    public int tamanho() {
        return proxLivre;
    }

    public int capacidade() {
        return CAPACIDADE;
    }

    public boolean insere(final int valor) {
        if (proxLivre >= CAPACIDADE) {
            return false;
        }
        base[proxLivre] = valor;
        proxLivre++;
        return true;
    }

    public int get(final int i) {
        if (i < 0 || i >= proxLivre) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return base[i];
    }

    public boolean remove(final int indice) {
        if (indice < 0 || indice >= proxLivre) {
            return false;
        }
        for (int i = indice; i < proxLivre - 1; i++) {
            base[i] = base[i + 1];
        }
        proxLivre--;
        return true;

    }

    public String toString() {
        if (proxLivre == 0) {
            return "[]";
        }
        StringBuilder aux = new StringBuilder("[");
        for (int i = 0; i < proxLivre - 1; i++) {
            aux.append(base[i]);
            aux.append(",");
        }
        aux.append(base[proxLivre - 1]);
        aux.append("]");
        return aux.toString();
    }
}
