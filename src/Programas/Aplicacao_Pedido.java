package Programas;

import java.util.Date;

import classes.Pedidos;
import entidades.enums.SituacaoPedido;

public class Aplicacao_Pedido {

	public static void main(String[] args) {

		Pedidos pedido = new Pedidos(1080, new Date(), SituacaoPedido.PENDENTE);

		SituacaoPedido os1 = SituacaoPedido.PENDENTE;
		SituacaoPedido os2 = SituacaoPedido.valueOf("PENDENTE");

		System.out.println(os1 + "\n" + os2);
	}

}
