package br.com.broker.core;

import javax.inject.Inject;

import br.com.broker.proxy.IServerMedicalProxy;

public class Broker implements IBroker {

	//Declaração dos serviores disponíveis
	@Inject
	private IServerMedicalProxy serverMedicalProxy;
	
	public String getMedicalColaboradores() {
		return serverMedicalProxy.getColaboradores();
	}
}
