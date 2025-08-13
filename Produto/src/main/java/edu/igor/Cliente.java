package edu.igor;

public class Cliente {
    private String nome;
    private String codigo;

    public Cliente(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public void Pessoa(String nome, String cpf){
        this.nome = nome;
        this.codigo = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCodigo(){
        return this.codigo;
    }

    @Override
    public String toString(){
        return String.format("%s %s",
                            this.nome,
                            this.codigo);
    }
}

