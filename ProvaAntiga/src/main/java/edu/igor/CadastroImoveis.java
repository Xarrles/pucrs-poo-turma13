package edu.igor;
import java.util.ArrayList;

public class CadastroImoveis {

    private ArrayList<Imovel> imoveis = new ArrayList<>();

    public String listar(){
        for (Imovel imovel : imoveis){
            System.out.println(imovel.toString());
        }

        return "";
    }

    public String listar(String nome){
        return "";
    }

    public void add(Imovel imovel){
    }
}
