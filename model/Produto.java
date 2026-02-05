package model;

public class Produto{

    private String nome;
    private double valor;
    private int quantidade;

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double novoValor){
        this.valor = novoValor;
    }
    
    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int novoQuantidade){
        this.quantidade = novoQuantidade;
    }
}