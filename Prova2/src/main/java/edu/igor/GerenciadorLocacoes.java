package edu.igor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class GerenciadorLocacoes implements Iterable<Locacao> {
    private List<Locacao> lista;

    private static GerenciadorLocacoes instance;

    public static GerenciadorLocacoes getInstance() {
        if (instance == null) {
             instance = new GerenciadorLocacoes(); 
        }
        return instance;
    }
    
    private GerenciadorLocacoes() { 
        lista = this.gerarLocacoes();
    }


    public void solicitaLocacao(int codCliente, int codFilme) {
        GerenciadorClientes cadCli = GerenciadorClientes.getInstance();
        GerenciadorFilmes cadFilmes = GerenciadorFilmes.getInstance();

        Cliente cli = cadCli.buscarCliente(codCliente);
        Filme filme = cadFilmes.buscarFilme(codFilme);

        if (cli == null || filme == null) {
            throw new IllegalArgumentException("codigo do filme ("+ codFilme+
                                                ") ou do cliente ("+codCliente+")inválido");
        }

        lista.add(new Locacao(LocalDate.now(), cli, filme));


    }
      

    public String toString() { return lista.toString();}

    /**
     * Implementação do método iterator() da interface Iterable.
     * Permite usar o GerenciadorClientes em um loop for-each.
     * @return um Iterator<Locacao>
     */
    @Override
    public Iterator<Locacao> iterator() {
        // Apenas delegamos a chamada para o iterator da lista interna
        return lista.iterator();
    }

    /**
     * Gera uma lista fictícia de 50 locações, usando os cadastros existentes.
     * @param cadFilmes O cadastro de filmes de onde buscarFilme será chamado.
     * @param cadClientes O cadastro de clientes de onde buscarCliente será chamado.
     * @return um ArrayList<Locacao> preenchido.
     */
    public ArrayList<Locacao> gerarLocacoes() {
        ArrayList<Locacao> locacoes = new ArrayList<>();
    
        GerenciadorFilmes cadFilmes = GerenciadorFilmes.getInstance();
        GerenciadorClientes cadClientes = GerenciadorClientes.getInstance();    

        Random rand = new Random();
        rand.setSeed(42);

        // Arrays com os códigos de ID que sabemos que existem nos seeds
        int[] idsClientes = {1, 2, 3};
        int[] idsFilmes = {
            101, 102, 103, 104, // Comédia
            201, 202, 203, 204, // Ação
            301, 302, 303, 304, // Romance
            401, 402, 403      // Drama
        };

        // Gerar 50 locações
        for (int i = 0; i < 50; i++) {
            // 1. Seleciona um ID de cliente e filme aleatoriamente
            int idClienteAleatorio = idsClientes[rand.nextInt(idsClientes.length)];
            int idFilmeAleatorio = idsFilmes[rand.nextInt(idsFilmes.length)];

            // 2. Busca os objetos usando os métodos solicitados
            Cliente cliente = cadClientes.buscarCliente(idClienteAleatorio);
            Filme filme = cadFilmes.buscarFilme(idFilmeAleatorio);

            // 3. Gera uma data aleatória (no último ano)
            LocalDate data = LocalDate.now().minusDays(rand.nextInt(365));

            // 4. Adiciona a nova locação
            if (cliente != null && filme != null) {
                Locacao loc = new Locacao(data, cliente, filme);
                if ( rand.nextInt(10) > 2) {
                    loc.devolver();
                }
                locacoes.add(loc);
            }
            
                
        }

        return locacoes;
    }
}