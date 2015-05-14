package br.com.medical.proxy.client.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.broker.core.Broker;
import br.com.broker.core.IBroker;
import br.com.infra.commons.entity.Colaborador;
import br.com.infra.commons.entity.Paciente;
import br.com.infra.commons.entity.TipoDeColaborador;
import br.com.infra.commons.entity.Usuario;
import br.com.infra.commons.util.UtilConverter;
import br.com.infra.commons.util.UtilMarshaller;
import br.com.medical.proxy.client.IClientMedicalProxy;

import com.google.gson.reflect.TypeToken;

public class ClientMedicalProxy implements IClientMedicalProxy, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4201066883952092901L;
	
	private IBroker broker = new Broker();

	public List<Colaborador> getColaboradores() {
		return UtilMarshaller.marshallerAllJsonToObject(broker.getMedicalColaboradores(), new TypeToken<ArrayList<Colaborador>>() {}.getType());
	}
	
	public List<TipoDeColaborador> getTiposDeColaboradores() {
		return UtilMarshaller.marshallerAllJsonToObject(broker.getMedicalTiposDeColaboradores(), new TypeToken<ArrayList<TipoDeColaborador>>() {}.getType());
	}

	public List<Paciente> getPacientes() {
		return UtilMarshaller.marshallerAllJsonToObject(broker.getMedicalPacientes(), new TypeToken<ArrayList<Paciente>>() {}.getType());
	}

	public void salvarColaborador(Colaborador colaborador) {
		broker.salvarColaborador(colaborador);
	}

	public boolean consultaUsuario(Usuario usuario) {
		return UtilConverter.jsonToObject(broker.consultaUsuario(usuario), Boolean.class);
	}

	public Usuario consultaUsuarioPorLogin(String userName) {
		return UtilConverter.jsonToObject(broker.consultaUsuarioPorLogin(userName), Usuario.class);
	}
	
}
