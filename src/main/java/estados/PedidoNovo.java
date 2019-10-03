package estados;

import pedido.Pedido;
import transicoes.Transicoes;

public class PedidoNovo implements Transicoes {

    public void pender(Pedido pedido) {
    	pedido.setTransicoes(new Pendente());
    	System.out.println("Seu pedido esta pendente.");
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
    	System.out.println("Transição invalida.");
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
    	pedido.setTransicoes(new PedidoNovo());
    	System.out.println("Pedido Criado Com Sucesso.");
    }
    
}
