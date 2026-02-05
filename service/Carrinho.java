package service;

import java.util.ArrayList;
import model.Produto;

public class Carrinho {
    private ArrayList<Produto> listaProdutos;

    public Carrinho() {
        this.listaProdutos = new ArrayList<Produto>();
    }

    public ArrayList<Produto> getListaProdutos(){
        return listaProdutos;
    }

    public void adicionarProduto(Produto produto){
        listaProdutos.add(produto);
    }
}
