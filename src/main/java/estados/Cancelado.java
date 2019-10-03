package estados;


import pedido.Pedido;
import transicoes.Transicoes;


public class Cancelado implements Transicoes {

    private boolean estadoFinal;
    
    public boolean isEstadoFinal() {
		return estadoFinal;
	}

	public void setEstadoFinal(boolean estadoFinal) {
		this.estadoFinal = estadoFinal;
	}

	public void pender(Pedido pedido) {
		System.out.println("Transi��o invalida.");
    }

    public void cancelar(Pedido pedido) {
    	System.out.println("Transi��o invalida.");
    }

    public void realizarPagamento(Pedido pedido) {  
    	System.out.println("Transi��o invalida.");
    }

    public void aprovar(Pedido pedido) {
    	System.out.println("Transi��o invalida.");
    }

    public void transportar(Pedido pedido) {
    	System.out.println("Transi��o invalida.");
    }

    public void entregar(Pedido pedido) {
    	System.out.println("Transi��o invalida.");
    }

    public void finalizar(Pedido pedido) {
    	System.out.println("Transi��o invalida.");
    }

    public void devolver(Pedido pedido) {
    	System.out.println("Transi��o invalida.");
    }
    
    public void novoPedido(Pedido pedido) {
    	pedido.setTransicoes(new PedidoNovo());
    	System.out.println("Seu novo pedido foi criado com sucesso.");
    }
}
