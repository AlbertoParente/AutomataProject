package estados;

import lombok.Data;
import pedido.Pedido;
import transicoes.Transicoes;

@Data
public class Finalizado implements Transicoes {

    private boolean estadoFinal;


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
    	System.out.println("Transição invalida.");
    }

    public void finalizar(Pedido pedido) {
    	System.out.println("Pedido ja finalizado.");
    }

    public void devolver(Pedido pedido) {
    	pedido.setTransicoes(new Devolvido());
    	System.out.println("Seu pedido foi encaminhado para devolução.");
    }
    
    public void novoPedido(Pedido pedido) {
    	pedido.setTransicoes(new PedidoNovo());
    	System.out.println("Seu novo pedido foi criado com sucesso.");
    }
}
