package edu.igor;

import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        this.voos = new ArrayList<>();
    }

    public void adicionarVoo(Voo voo) {
        // Adiciona o novo voo na lista -
        this.voos.add(voo);
    }

    public ArrayList<Voo> listarTodos() {
        
        for (Voo v : voos) {
            // Printa todos os voos no formato "ORIGEM -> DESTINO em DATAHORA (STATUS)"
            System.out.println(
                v.getRota().getOrigem().getCodigo() + 
                " -> " + 
                v.getRota().getDestino().getCodigo() + 
                " em " 
                + v.getDatahora() + 
                " (" + v.getStatus() + ")");
        }
        return null;
    }

    public ArrayList<Voo> buscarData(LocalDate data) {
        // TODO implementar
        return null;
    }

}
