package edu.igor;

public class ItemVenda {
    
    private int qtde;
    private Produto produto;

    public ItemVenda(int umQtde, Produto umProduto){
        this.qtde = umQtde;
        this.produto = umProduto;
    }
    
    @Override
    public String toString(){
        return String.format("{%d} \t %s",
                            this.qtde,
                            this.produto);
    }

}
