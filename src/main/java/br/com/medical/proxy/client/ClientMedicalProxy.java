package br.com.medical.proxy.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.broker.core.IBroker;
import br.com.infra.commons.entity.Colaborador;
import br.com.infra.commons.entity.Paciente;
import br.com.infra.commons.entity.TipoDeColaborador;
import br.com.infra.commons.util.UtilMarshaller;

import com.google.gson.reflect.TypeToken;

public class ClientMedicalProxy implements IClientMedicalProxy, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4201066883952092901L;
	
	@Inject
	private IBroker broker;

	public List<Colaborador> getColaboradores() {
		return UtilMarshaller.marshallerAllJsonToObject(broker.getMedicalColaboradores(), new TypeToken<ArrayList<Colaborador>>() {}.getType());
	}

	public List<TipoDeColaborador> getTiposDeColaboradores() {
		return UtilMarshaller.marshallerAllJsonToObject(broker.getMedicalTiposDeColaboradores(), new TypeToken<ArrayList<TipoDeColaborador>>() {}.getType());
	}

	public List<Paciente> getPacientes() {
		return UtilMarshaller.marshallerAllJsonToObject(broker.getMedicalPacientes(), new TypeToken<ArrayList<Paciente>>() {}.getType());
	}
	
}
