package view;

import java.util.Scanner;
import model.Produto;

public class Interface {
    
    Scanner scanner = new Scanner(System.in);

    public Produto menu(){

        String[] produtos = {"Coxinha", "Pastel", "Hot dog", "Empada", "Risóles", "Bolo", "Sorvete", "Água", "Refri", "Café"};
        double[] precos = {5.99, 5.99, 6.99, 5.99, 5.99, 8.99, 4.99, 3.99, 4.99, 5.99};

        System.out.println("\t\tBem-vindo"
                         + "\n1.  Coxinha --- R$5.99"
                         + "\n2.  Pastel ---- R$5.99"
                         + "\n3.  Hot dog --- R$6.99"
                         + "\n4.  Empada ---- R$5.99"
                         + "\n5.  Risóles --- R$5.99"
                         + "\n6.  Bolo ------ R$8.99"
                         + "\n7.  Sorvete --- R$4.99"
                         + "\n8.  Água ------ R$3.99"
                         + "\n9.  Refri ----- R$4.99"
                         + "\n10. Café ------ R$5.99");
        int opcao = scanner.nextInt() - 1;
        limpar();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        limpar();
        return new Produto(produtos[opcao], precos[opcao], quantidade);
    }

    public int confirmacaoMenu(){
        System.out.println("Deseja adicionar mais um produto? (1 -> Sim / 2 -> Não)");
        int resposta = scanner.nextInt();
        return resposta;
    }

    public void pagamento(double valorTotal){
        System.out.println("Valor total a pagar: R$" + valorTotal);

        System.out.println("\t\tForma de pagamento"
                         + "\n1. Crédito"
                         + "\n2. Débito"
                         + "\n3. Pix"
        );
        int formaPagamento = scanner.nextInt();

        switch (formaPagamento) {
            case 1:
                System.out.println("Insire ou aproxime o cartão na maquininha");
                break;
        
            case 2: 
                System.out.println("Insire ou aproxime o cartão na maquininha");
                break;

            case 3:
                System.out.println("Leia o QR Code na maquininha");
                break;
        }
    }

    public void limpar(){
        scanner.hasNextLine();
    }

    public int confirmacaoFinal(){
        System.out.println("Deseja fazer outro pedido?(1 -> Sim / 2 -> Não)");
        int resposta = scanner.nextInt();
        return resposta;
    }
}
