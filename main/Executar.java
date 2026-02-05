package main;

import model.*;
import service.*;
import view.*;

public class Executar{
    public static void main(String[] args) {
        
        int respostaFinal;

        do {
            int resposta;
            Interface ui = new Interface();
            Carrinho carrinho = new Carrinho();
            Venda venda = new Venda();

            do {
                Produto produto = ui.menu();
                carrinho.adicionarProduto(produto);
                resposta = ui.confirmacaoMenu();
            } while (resposta == 1);

            double valorTotal = venda.calculoValorTotal(carrinho.getListaProdutos());

            ui.pagamento(valorTotal);

            respostaFinal = ui.confirmacaoFinal();
        } while (respostaFinal == 1);
    }
}