import java.util.Arrays;

public class App {
    public static void main(String args[]) {

        System.out.println(Arrays.toString(args));
        System.out.println(args.length);

        if (args.length != 3) {
            System.out.println("Informe 3 valores!");
            return;
        }
        String placa;
        double combustivel, distancia;

        try {
            placa = args[0];
            combustivel = Double.parseDouble(args[1]);
            distancia = Double.parseDouble(args[2]);
        } catch (Exception e) {
            System.out.println("Informe 3 valores corretos!");
            return;
        }

        Placa2 p1 = new Placa2("brasil", placa);

        Veiculo v = new Veiculo(p1);
        System.out.println("Dados do veiculo antes de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.abastece(combustivel);
        System.out.println("Dados do veiculo depois de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.dirige(distancia);
        System.out.println("Dados do veiculo depois de percorrer " + distancia + "Km:");
        System.out.println(v);
        System.out.println("----------------");
    }
}