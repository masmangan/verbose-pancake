package day06;

import java.util.Random;

//2) Desenvolva uma abstração de uma lâmpada, a qual 
// pode ser ligada e desligada. Sabe-se que 
//a lâmpada pode queimar ao ser ligada com uma chance de 30%,
// e que uma vez queimada ela 
//não pode mais ser ligada ou desligada novamente. //
// Deve ser possível observar o estado da 
//lâmpada (se desligada, ligada ou queimada). 
// Dica: utilize o gerador de números aleatórios de 
//Java, classe Random, para sortear a chance de uma 
//lâmpada queimar quando for ligada
public class Lampada {

    private Random random;
    private Estado estado;

    public Lampada() {
        estado = Estado.DESLIGADA;
        random = new Random();
    }

    public void ligar() {
        if (estado == Estado.QUEIMADA)
            return;

        estado = Estado.LIGADA;
        if (random.nextInt(100) < 30)
            estado = Estado.QUEIMADA;
    }

    public void desligar() {
        if (estado == Estado.QUEIMADA)
            return;
        estado = Estado.DESLIGADA;
    }

    public Estado getEstado() {
        return estado;
    }

}
