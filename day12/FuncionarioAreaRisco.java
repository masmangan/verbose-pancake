
public class FuncionarioAreaRisco extends Funcionario {

    public FuncionarioAreaRisco(String matricula, String nome, double salarioBruto) {
        super(matricula, nome, salarioBruto);
    }

    @Override
    public double getSalarioLiquido() {
        return super.getSalarioLiquido() + getSalarioBruto() * .15;
    }
}
