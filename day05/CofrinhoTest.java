public class CofrinhoTest {
    public static void main(String[] args) {
        Cofrinho c1 = new Cofrinho();

        System.out.println(c1);
        System.out.println(c1.getQtdadeMoedas());

        System.out.println(c1.insere(new Moeda(NomeMoeda.UmReal)));
        System.out.println(c1);
        System.out.println(c1.getQtdadeMoedas());

        System.out.println(c1.insere(new Moeda(NomeMoeda.Um)));
        System.out.println(c1);
        System.out.println(c1.getQtdadeMoedas());

        System.out.println(c1.insere(new Moeda(NomeMoeda.Cinco)));
        System.out.println(c1);
        System.out.println(c1.getQtdadeMoedas());

        System.out.println(c1.insere(new Moeda(NomeMoeda.VinteCinco)));
        System.out.println(c1);
        System.out.println(c1.getQtdadeMoedas());

        System.out.println(c1.retira());
        System.out.println(c1);
        System.out.println(c1.getQtdadeMoedas());

        System.out.println(c1.retira());
        System.out.println(c1);
        System.out.println(c1.getQtdadeMoedas());

        System.out.println(c1.retira());
        System.out.println(c1);
        System.out.println(c1.getQtdadeMoedas());

        System.out.println(c1.retira());
        System.out.println(c1);
        System.out.println(c1.getQtdadeMoedas());

        System.out.println(c1.getQtdadeMoedasTipo(NomeMoeda.Dez));
        System.out.println(c1.getValorTotalCentavos());
        System.out.println(c1.getValorTotalReais());

        c1.insere(new Moeda(NomeMoeda.Dez));
        System.out.println(c1.getQtdadeMoedasTipo(NomeMoeda.Dez));
        System.out.println(c1.getValorTotalCentavos());
        System.out.println(c1.getValorTotalReais());
        c1.insere(new Moeda(NomeMoeda.Dez));
        System.out.println(c1.getQtdadeMoedasTipo(NomeMoeda.Dez));
        System.out.println(c1.getValorTotalCentavos());
        System.out.println(c1.getValorTotalReais());
        c1.insere(new Moeda(NomeMoeda.Dez));
        System.out.println(c1.getQtdadeMoedasTipo(NomeMoeda.Dez));
        System.out.println(c1.getValorTotalCentavos());
        System.out.println(c1.getValorTotalReais());

    }
}