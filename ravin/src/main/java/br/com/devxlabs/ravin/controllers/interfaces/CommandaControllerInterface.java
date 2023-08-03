package br.com.devxlabs.ravin.controllers.interfaces;

import br.com.devxlabs.ravin.enums.CommandaStatus;
import br.com.devxlabs.ravin.models.Commanda;
import br.com.devxlabs.ravin.models.Order;

public interface CommandaControllerInterface extends ControllerInterface<Commanda> {
	
	public void addOrder(Order order) throws Exception;
	public void removeOrder(Order pedido) throws Exception;
	public void closeCommanda() throws Exception;
	public void listCommandasByStatus(CommandaStatus status);
	public double calculateTotalCommandaValue();

}
