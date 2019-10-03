package estados;

import pedido.Pedido;
import transicoes.Transicoes;

public class Entregue implements Transicoes {

    public void pender(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void cancelar(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void realizarPagamento(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void aprovar(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void transportar(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void entregar(Pedido pedido) {
    	System.out.println("Pedido ja entregue.");
    }

    public void finalizar(Pedido pedido) {
    	pedido.setTransicoes(new Finalizado());
    	System.out.println("Seu pedido finalizado com sucesso.");
    }

    public void devolver(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }
    
    public void novoPedido(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }
}
