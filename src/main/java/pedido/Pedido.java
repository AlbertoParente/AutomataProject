package pedido;

import estados.PedidoNovo;
import transicoes.Transicoes;

public class Pedido {
	
	private Transicoes transicoes = new PedidoNovo();
	
	
	public Transicoes getTransicoes() {
		return transicoes;
	}

	public void setTransicoes(Transicoes transicoes) {
		this.transicoes = transicoes;
	}

	public void pender(){
		transicoes.pender(this);
	}

    public void cancelar(){
    	transicoes.cancelar(this);
    }
    
    public void realizarPagamento(){
    	transicoes.realizarPagamento(this);
    }

    public void aprovar(){
    	transicoes.aprovar(this);
    }

    public void transportar(){
    	transicoes.transportar(this);
    }

    public void entregar(){
    	transicoes.entregar(this);
    }

    public void finalizar(){
    	transicoes.finalizar(this);
    }

    public void devolver(){
    	transicoes.devolver(this);
    }

    public void novoPedido(){
    	transicoes.novoPedido(this);
    }

}
