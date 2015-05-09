package br.com.broker.core;

import br.com.broker.proxy.IServerCepProxy;
import br.com.broker.proxy.IServerMedicalProxy;
import br.com.broker.proxy.ServerCepProxy;
import br.com.broker.proxy.ServerMedicalProxy;

public class Broker implements IBroker {

	//Declaração dos serviores disponíveis
//	@Inject
	private IServerMedicalProxy serverMedicalProxy = new ServerMedicalProxy();
	
//	@Inject
	private IServerCepProxy cepProxy = new ServerCepProxy();
	
	public String getMedicalColaboradores() {
		return serverMedicalProxy.getColaboradores();
	}

	public String getEndereco(String cep) {
		return cepProxy.buscaEndereco(cep);
	}

	public String getMedicalTiposDeColaboradores() {
		return serverMedicalProxy.getTipoDeColaboradores();
	}

	public String getMedicalPacientes() {
		return serverMedicalProxy.getPacientes();
	}
}
