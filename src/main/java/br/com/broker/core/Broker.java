package br.com.broker.core;

import java.io.Serializable;

import br.com.broker.proxy.server.IServerAddressProxy;
import br.com.broker.proxy.server.IServerMedicalProxy;
import br.com.broker.proxy.server.impl.ServerAddressProxy;
import br.com.broker.proxy.server.impl.ServerMedicalProxy;
import br.com.infra.commons.entity.Colaborador;
import br.com.infra.commons.entity.Usuario;

public class Broker implements IBroker, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7213258197867467085L;

	//Declaração dos serviores disponíveis
	private IServerMedicalProxy serverMedicalProxy = new ServerMedicalProxy();
	
	private IServerAddressProxy cepProxy = new ServerAddressProxy();
	
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

	public void salvarColaborador(Colaborador colaborador) {
		serverMedicalProxy.salvarColaborador(colaborador);
	}

	public String consultaUsuario(Usuario usuario) {
		return serverMedicalProxy.consultaUsuario(usuario);
	}

	public String consultaUsuarioPorLogin(String userName) {
		return serverMedicalProxy.consultaUsuarioPorLogin(userName);
	}

	public String consultaUsuarioPorId(Integer id) {
		return serverMedicalProxy.consultaUsuarioPorId(id);
	}

	public void setTenant(String tenant) {
		serverMedicalProxy.setTenant(tenant);
	}
}
