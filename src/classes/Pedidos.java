package classes;

import java.util.Date;

import entidades.enums.SituacaoPedido;

public class Pedidos {

	private Integer id;
	private Date moment;
	private SituacaoPedido status;

	public Pedidos(Integer id, Date moment, SituacaoPedido status) {
		super();
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public SituacaoPedido getStatus() {
		return status;
	}

	public void setStatus(SituacaoPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}

}
