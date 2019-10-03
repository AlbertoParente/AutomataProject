package estados;

import pedido.Pedido;
import transicoes.Transicoes;

public class Aprovado implements Transicoes {


    public void pender(Pedido pedido) {
    	System.out.println("Transição invalida.");

    }

    public void cancelar(Pedido pedido) {
    	pedido.setTransicoes(new Cancelado());
    	System.out.println("Pedido Cancelado com sucesso.");
    }

    public void realizarPagamento(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void aprovar(Pedido pedido) {
    	System.out.println("Pedido ja aprovado.");

    }

    public void transportar(Pedido pedido) {
    	pedido.setTransicoes(new Transportado());
    	System.out.println("Pedido encaminhado para transporte.");
    }

    public void entregar(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void finalizar(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void devolver(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }
    
    public void novoPedido(Pedido pedido) {
    	//pedido.setTransicoes(new PedidoNovo());
    	//System.out.println("Seu pedido foi criado com sucesso.");
    	System.out.println("Transição invalida.");
    }
}
