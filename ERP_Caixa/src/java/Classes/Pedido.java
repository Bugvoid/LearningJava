/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Luan.Castro
 */
public class Pedido {
    private int id_pedido;
    private float valorTotalPedido;
    private String forma_pagamento;

    public Pedido() {
    }

    public Pedido(int id_pedido, float valorTotalPedido, String forma_pagamento) {
        this.id_pedido = id_pedido;
        this.valorTotalPedido = valorTotalPedido;
        this.forma_pagamento = forma_pagamento;
    }

    
    
    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public float getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(float valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }
    
    
}
