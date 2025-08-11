import java.util.Arrays;

public class Cofrinho {

    public final int MAX_MOEDAS = 3; // máximo de moedas que cabem no cofrinho
    private Moeda[] moedas; // um arranjo que armazena as moedas
    private int tamanho; // quantidade de moedas no cofrinho

    public Cofrinho() {
        moedas = new Moeda[MAX_MOEDAS];
        tamanho = 0;
    }

    /**
     * Insere uma moeda no cofrinho.
     * 
     * Como um “cofrinho” tem capacidade limitada, deve
     * retornar true se conseguiu inserir a moeda e
     * false caso contrário.
     * 
     * @param moeda
     * @return true se a moeda foi inserida no cofrinho
     */
    public boolean insere(Moeda moeda) {
        if (moeda == null)
            throw new IllegalArgumentException("A moeda não pode ser null!");

        if (tamanho >= MAX_MOEDAS)
            return false;

        moedas[tamanho] = moeda;
        tamanho++;
        return true;
    }

    /**
     * Retira do cofrinho a última moeda inserida.
     * 
     * Se esta operação for chamada várias vezes
     * deve ir retirando todas as moedas na ordem
     * inversa em que foram inseridas.
     * 
     * Deve retornar a moeda retirada ou “null”
     * caso o cofrinho esteja vazio
     * 
     * @return null se o cofrinho está vazio,
     *         caso contrário retorna a moeda inserida por último.
     */
    Moeda retira() {
        if (tamanho == 0)
            return null;

        Moeda m;
        tamanho--;
        m = moedas[tamanho];
        moedas[tamanho] = null;
        return m;
    }

    /**
     * informa quantas moedas estão guardadas
     * no cofrinho
     * 
     * @return
     */
    public int getQtdadeMoedas() {
        return tamanho;
    }

    /**
     * Informa quantas moedas de um certo tipo estão 
     * guardadas no cofrinho.
     * 
     * @param nomeMoeda
     * @return
     */
    public int getQtdadeMoedasTipo(NomeMoeda nomeMoeda) {
        int c = 0;
        //for (int i = 0; i < tamanho; i++) {
        //    if (nomeMoeda == moedas[i].getNomeMoeda()) {
        //        c = c + 1;
        //    }
        //}
        for (Moeda m : moedas) {
            if (nomeMoeda == m.getNomeMoeda()) {
                c = c + 1;
            }
        }
        return c;
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return super.toString() + String.format("%s", Arrays.toString(moedas));
    }

}
