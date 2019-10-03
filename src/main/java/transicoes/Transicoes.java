package transicoes;

import pedido.Pedido;

public interface Transicoes {

    void pender(Pedido pedido);
    void cancelar(Pedido pedido);
    void realizarPagamento(Pedido pedido);
    void aprovar(Pedido pedido);
    void transportar(Pedido pedido);
    void entregar(Pedido pedido);
    void finalizar(Pedido pedido);
    void devolver(Pedido pedido);
    void novoPedido(Pedido pedido);
    
}
