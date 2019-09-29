package estados;

import lombok.Data;
import pedido.Pedido;
import transicoes.Transicoes;

@Data
public class Cancelado implements Transicoes {

    private boolean estadoFinal;


    public void pender(Pedido pedido) {

    }

    public void cancelar(Pedido pedido) {

    }

    public void realizarPagamento(Pedido pedido) {

    }

    public void aprovar(Pedido pedido) {

    }

    public void transportar(Pedido pedido) {

    }

    public void entregar(Pedido pedido) {

    }

    public void finalizar(Pedido pedido) {

    }

    public void devolver(Pedido pedido) {

    }
}
