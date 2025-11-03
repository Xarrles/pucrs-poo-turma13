package edu.igor;
import java.util.ArrayList;


class Estacionamento {
    private final int CAPACIDADE = 500;
    private int capacidade;
    private int VagasOcupadas;
    private ArrayList<Object> cadastro;

    public Estacionamento(){
        this.capacidade = CAPACIDADE;
        this.VagasOcupadas = 0;
        this.cadastro = new ArrayList<Object>();
    }

    private boolean EntrarVeiculo(){
        if (this.VagasOcupadas >= this.capacidade){
            return false;
        }

        return true;
    }


}
