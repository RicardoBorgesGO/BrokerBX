package br.com.broker.proxy.impl;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.broker.proxy.IServerMedicalProxy;
import br.com.infra.commons.entity.Colaborador;
import br.com.infra.commons.entity.Paciente;
import br.com.infra.commons.entity.TipoDeColaborador;
import br.com.infra.commons.entity.Usuario;
import br.com.infra.commons.util.UtilConverter;
import br.com.infra.commons.util.UtilJson;

import com.google.gson.reflect.TypeToken;

public class ServerMedicalProxy implements IServerMedicalProxy, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5446489735473337136L;
	
	public String getColaboradores() {
		return UtilJson.getAllObjectJson(URL_SERVICE + "/rest/colaborador/getColaboradores", new TypeToken<ArrayList<Colaborador>>() {}.getType());
	}
	
	public String getTipoDeColaboradores() {
		return UtilJson.getAllObjectJson(URL_SERVICE + "/rest/colaborador/getTiposDeColaboradores", new TypeToken<ArrayList<TipoDeColaborador>>() {}.getType());
	}

	public String getPacientes() {
		return UtilJson.getAllObjectJson(URL_SERVICE + "/rest/paciente/getPacientes", new TypeToken<ArrayList<Paciente>>() {}.getType());
	}

	public void salvarColaborador(Colaborador colaborador) {
		String colaboradorJson = UtilConverter.objectToJson(colaborador);
		
		//TODO retorna mensagem
		UtilJson.postJson(URL_SERVICE + "/rest/colaborador/setColaborador", colaboradorJson);
	}

	public String consultaUsuario(Usuario usuario) {
		String usuarioJson = UtilConverter.objectToJson(usuario);
		
		return UtilJson.postJson(URL_SERVICE + "/rest/usuario/realizarLogin", usuarioJson);
	}

}
