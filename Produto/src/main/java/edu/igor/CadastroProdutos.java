package edu.igor;

import java.util.ArrayList;

public class CadastroProdutos{

    private static CadastroProdutos instance;

    // Não devia estar fazendo isso na quinta aula
    // por enquanto vamos ter fé que vai ser útil
    // e que em algum momento vocês vão entender
    //
    // Nome Disso - padrão de projeto singletom
    //
    public static CadastroProdutos getInstance(){
        if (instance == null){
            instance = new CadastroProdutos();
        }
        return instance;
    }

    private ArrayList<Produto> listaProd;

    private CadastroProdutos(){
        listaProd = new ArrayList<>();
    }
}