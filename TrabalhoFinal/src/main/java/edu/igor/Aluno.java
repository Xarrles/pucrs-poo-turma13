package edu.igor;
import java.util.ArrayList;
import java.time.LocalDate;

class Aluno{

    private String nome;
    private ArrayList<String> lista;
    private String Matricula;
    private LocalDate dataEntrada;

    public Aluno(String nome){
        this.nome = nome;
        this.lista = new ArrayList<String>();
    }

    public void CadastroPlaca(String placa){

        if (this.lista.size() >= 2){
            System.out.println("Usuário: " + this.nome + " - Limite de placas atingido. Quantidade máxima 2 registros");
            return;
        }

        this.lista.add(placa);
    }


    @Override()
    public String toString(){
        return "Nome: " + this.nome + " Placas: " + this.lista.toString();
    }
}
