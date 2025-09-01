package edu.igor;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;

    private ArrayList<ItemVenda> itens;
 
    public Venda(Cliente umCliente) {
        itens = new ArrayList<>();
        this.cliente = umCliente;
    }

    public void inserir(Produto prod) {
        ItemVenda item = new ItemVenda(1, prod);
        itens.add(item);
    }
    
    public void inserir(int quantidade, Produto prod) {
        ItemVenda item = new ItemVenda(quantidade, prod);
        itens.add(item);
    }

    public double valorTotal() {
        double total = 0;

        for (ItemVenda item : itens) {
            total = total + item.getValor();
        }

        return total;
    }

    public String fecharVenda() {
        // gera a nota de venda
        StringBuilder notaF = new StringBuilder();
                                   
        notaF.append("\nNota de Venda (Exercício Vendas Prj) - POO \n");
        notaF.append("\nCliente: ");
        //notaF.append(cliente.toString());
        // ou... somente
        notaF.append(cliente.getNome());
        notaF.append("\n");

        for (ItemVenda item : itens) {
            notaF.append("\n   ");
            notaF.append(item.toString());
        }

        notaF.append(String.format("\n\n\t    Valor total: R$ %5.2f",this.valorTotal()));
        notaF.append("\n-------------------------------------------------\n");

        for (ItemVenda item: itens){
            Produto prod = item.getProduto();

            if (prod instanceof ProdutoEE){
                ProdutoEE prodEE = (ProdutoEE) prod;
                notaF.append(prodEE.getGarantia());
                notaF.append("\n----------------------------------------\n");
            }
        }
        
        return notaF.toString();
    }
    
}