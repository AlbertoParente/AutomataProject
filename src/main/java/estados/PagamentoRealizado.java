package estados;

import pedido.Pedido;
import transicoes.Transicoes;

public class PagamentoRealizado implements Transicoes {

    public void pender(Pedido pedido) {
    	System.out.println("Transição invalida.");
    }

    public void cancelar(Pedido pedido) {
    	pedido.setTransicoes(new Cancelado());
    	System.out.println("Seu pedido foi criado com sucesso.");
    }

    public void realizarPagamento(Pedido pedido) {
    	System.out.println("Pagamento ja realizado.");
    }

    public void aprovar(Pedido pedido) {
    	pedido.setTransicoes(new Aprovado());
    	System.out.println("Seu pedido foi aprovado.");
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
    	System.out.println("Seu pedido foi criado com sucesso.");
    }
}
