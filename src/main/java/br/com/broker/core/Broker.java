package br.com.broker.core;

import javax.inject.Inject;

import br.com.broker.proxy.IServerCepProxy;
import br.com.broker.proxy.IServerMedicalProxy;

public class Broker implements IBroker {

	//Declaração dos serviores disponíveis
	@Inject
	private IServerMedicalProxy serverMedicalProxy;
	
	@Inject
	private IServerCepProxy cepProxy;
	
	public String getMedicalColaboradores() {
		return serverMedicalProxy.getColaboradores();
	}

	public String getEndereco(String cep) {
		return cepProxy.buscaEndereco(cep);
	}
}
