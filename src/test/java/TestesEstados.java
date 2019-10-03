import org.junit.Before;
import org.junit.Test;

import pedido.Pedido;

public class TestesEstados {
	
	private Pedido pedido;
	
	@Before
	public void before() {
		System.out.println("Seu pedido foi criado com sucesso.");
		pedido = new Pedido();	
	}
	
	@Test
	public void testeNovoPedidoParaCancelado() {
		System.out.println("testeNovoPedidoParaCancelado");
		//pedido.novoPedido();
		pedido.pender();
		pedido.cancelar();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
	}
	
	@Test
	public void testeNovoPedidoParaFinalizado() {
		System.out.println("testeNovoPedidoParaFinalizado");
		//pedido.novoPedido();
		pedido.pender();
		pedido.realizarPagamento();
		pedido.aprovar();
		pedido.transportar();
		pedido.entregar();
		pedido.finalizar();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
	}
	

	
	@Test
	public void testeNovoPedidoParaFinalizadoParaDevolvido() {
		System.out.println("testeNovoPedidoParaFinalizadoParaDevolvido");
		//pedido.novoPedido();
		pedido.pender();
		pedido.realizarPagamento();
		pedido.aprovar();
		pedido.transportar();
		pedido.entregar();
		pedido.finalizar();
		pedido.devolver();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
	}
	
	@Test
	public void testeNovoPedidoParaFinalizadoParaPedidoNovo() {
		System.out.println("testeNovoPedidoParaFinalizadoParaPedidoNovo");
		//pedido.novoPedido();
		pedido.pender();
		pedido.realizarPagamento();
		pedido.aprovar();
		pedido.transportar();
		pedido.entregar();
		pedido.finalizar();
		pedido.novoPedido();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
	}
	
	@Test
	public void testeNovoPedidoParaFinalizadoParaDevolvidoParaPedidoNovo() {
		System.out.println("testeNovoPedidoParaFinalizadoParaDevolvidoParaPedidoNovo");
		//pedido.novoPedido();
		pedido.pender();
		pedido.realizarPagamento();
		pedido.aprovar();
		pedido.transportar();
		pedido.entregar();
		pedido.finalizar();
		pedido.novoPedido();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
	}
	
	@Test
	public void testeErroPedidoNovoParaDiretoAprovado() {
		System.out.println("testeErroPedidoNovoParaDiretoAprovado");
		//pedido.novoPedido();
		pedido.aprovar();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
	}
	
	@Test
	public void testeErroPedidoNovoParaDiretoAprovadoSeguindoAteFinalizado() {
		System.out.println("testeErroPedidoNovoParaDiretoAprovadoSeguindoAteFinalizado");
		//pedido.novoPedido();
		pedido.aprovar();
		pedido.transportar();
		pedido.entregar();
		pedido.finalizar();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
	}
	
	@Test
	public void testeErroPedidoNovoParaEntregueParaCancelado() {
		System.out.println("testeErroPedidoNovoParaEntregueParaCancelado");
		//pedido.novoPedido();
		pedido.pender();
		pedido.realizarPagamento();
		pedido.aprovar();
		pedido.transportar();
		pedido.entregar();
		pedido.cancelar();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
	}
	
	@Test
	public void testeErroPedidoNovoAteEntregueParaCanceladoparaParaPedidoNovo() {
		System.out.println("testeErroPedidoNovoAteEntregueParaCanceladoparaParaPedidoNovo");
		//pedido.novoPedido();
		pedido.pender();
		pedido.realizarPagamento();
		pedido.aprovar();
		pedido.transportar();
		pedido.entregar();
		pedido.cancelar();
		pedido.novoPedido();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
	}
	
	@Test
	public void testeErroPedidoNovoParaCanceladoParaDevolvido() {
		System.out.println("testeErroPedidoNovoParaCanceladoParaDevolvido");
		//pedido.novoPedido();
		pedido.pender();
		pedido.cancelar();
		pedido.devolver();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println();
	}
	
}
