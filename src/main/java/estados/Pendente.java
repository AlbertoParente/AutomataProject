package estados;

import pedido.Pedido;
import transicoes.Transicoes;

public class Pendente implements Transicoes {

    public void pender(Pedido pedido) {
    	System.out.println("Pedido ja pendente.");
    }

    public void cancelar(Pedido pedido) {
    	pedido.setTransicoes(new Cancelado());
    	System.out.println("Seu pedido foi cancelado com sucesso.");
    }

    public void realizarPagamento(Pedido pedido) {
    	pedido.setTransicoes(new PagamentoRealizado());
    	System.out.println("Pagamento realizado com sucesso.");    	
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
    	System.out.println("Transição invalida.");
    }
}
