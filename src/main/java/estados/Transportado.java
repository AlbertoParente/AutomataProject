package estados;

import pedido.Pedido;
import transicoes.Transicoes;

public class Transportado implements Transicoes {

    public void pender(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void cancelar(Pedido pedido) {
    	pedido.setTransicoes(new Cancelado());
    	System.out.println("Seu pedido cancelado com sucesso.");
    }

    public void realizarPagamento(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void aprovar(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void transportar(Pedido pedido) {
    	System.out.println("Pedido ja em transporte.");
    }

    public void entregar(Pedido pedido) {
    	pedido.setTransicoes(new Entregue());
    	System.out.println("Seu pedido foi encaminhado para entrega.");
    }

    public void finalizar(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void devolver(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }
    
    public void novoPedido(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }
}
