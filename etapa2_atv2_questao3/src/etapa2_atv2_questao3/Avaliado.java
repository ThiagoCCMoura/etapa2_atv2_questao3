package etapa2_atv2_questao3;

import java.util.Random;

public class Avaliado extends Processo {
	
    public Avaliado() {
        super(null, "");
    }

    @Override
    public void mostrarInformacao() {
        avaliar();
        System.out.println("##### O projeto foi: " + getInformacao() + " #####");
    }

    private void avaliar() {
        Random r = new Random();
        setInformacao(r.nextDouble() > 0.5? "Deferido" : "Indeferido");
    }
}
