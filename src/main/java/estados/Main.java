package estados;

import pedido.Pedido;

public class Main {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.pender();
		pedido.cancelar();
		pedido.realizarPagamento();
		pedido.aprovar();
		pedido.transportar();
		pedido.entregar();
		pedido.finalizar();
		pedido.devolver();
		pedido.novoPedido();
	
		
	}

}
