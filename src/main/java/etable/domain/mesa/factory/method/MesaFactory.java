package etable.domain.mesa.factory.method;

import etable.domain.mesa.model.Mesa;

public class MesaFactory implements IProducto{

	private Mesa mesa;
	public MesaFactory(Mesa mesa) {
		this.mesa = mesa;
	}
	@Override
	public Mesa getMesa() {
		return this.mesa;
	}

}
