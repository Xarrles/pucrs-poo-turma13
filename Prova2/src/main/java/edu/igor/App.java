package edu.igor;

public class App {
    public static void main(String[] args) {
        GerenciadorClientes cadClientes = GerenciadorClientes.getInstance();
        GerenciadorFilmes cadFilmes = GerenciadorFilmes.getInstance();
        GerenciadorLocacoes cadLocacoes = GerenciadorLocacoes.getInstance(); 

        System.out.println("\nTodos os clientes:  ");
       for (Cliente cli : cadClientes) {
           System.out.println("\t"+cli);
       }


        System.out.println("\nTodos os filmes: ");
        for (Filme f : cadFilmes) {
            System.out.println("\t"+f);
        }
 
        cadLocacoes.solicitaLocacao(1, 101);
        System.out.println("\nTodas as locações: ");
        for (Locacao l : cadLocacoes) {
            System.out.println(l);
        }  

        System.out.println();

    }
}
