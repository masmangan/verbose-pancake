import java.util.regex.Pattern;

/**
 * A classe Placa armazena o código e o país de um licença de veículo.
 * 
 * O formato do código da placa é LLLDLDD, onde L é uma letra e D um dígito.
 * 
 * @author julioapm@pucrs.br
 * @author marco.mangan@pucrs.br
 */
public class Placa2{
    private String pais;
    private String codigo; // LLLNLNN

    /**
     * Constrói uma nova licença.
     * 
     * @param pais não pode ser null!
     * @param codigo tem que respeitar o formato!
     */
    public Placa2(String pais,String codigo){
        setPais(pais);
        if (Pattern.matches("[A-Z]{3}[0-9][A-Z][0-9]{2}", codigo) == true){
            this.codigo = codigo;
        }else{
            throw new IllegalArgumentException("Código inválido!");
        }
    }

    public void setPais(String pais){
        if (pais == null) {
            throw new IllegalArgumentException("País inválido!");
        }
        pais = pais.toUpperCase();
        this.pais = pais;
    }

    public String getPais(){
        return pais;
    }

    public String getCodigo(){
        return codigo;
    }

    public String toString(){
        if (codigo.equals("AAA0A00")){
            return("Invalida!");
        }else{
            return(codigo+":"+pais);
        }
    }
}