package etapa2_atv2_questao3;


import java.util.ArrayList;
import java.util.List;

public class ProjetoController {
    private List<Processavel> processo = new ArrayList<>();

    public ProjetoController() {
        this.processo.add(new Gestacao());
    }

    public void realizaProjeto() {

        while (processo.get(processo.size() - 1) != (null)) {
            processo.add(processo.get(processo.size() - 1).prosseguir());
        }
    }
}