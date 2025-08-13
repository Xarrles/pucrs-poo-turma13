package edu.igor;

public class App {
    public static void main(String[] args) {
        Produto p1 = new Produto(123, "teste", 2.5);

        CadastroProdutos cadProd = CadastroProdutos.getInstance();

        cadProd.cadastror(p1);
    }
}
