package br.com.broker.proxy.server.impl;

import java.io.Serializable;

import br.com.broker.proxy.server.IServerMedicalProxy;
import br.com.infra.commons.entity.Colaborador;
import br.com.infra.commons.entity.Usuario;
import br.com.infra.commons.util.UtilConverter;
import br.com.infra.commons.util.UtilJson;

public class ServerMedicalProxy implements IServerMedicalProxy, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5446489735473337136L;
	
	public String getColaboradores() {
		return UtilJson.getObjectJson(URL_SERVICE + "/rest/colaborador/getColaboradores");
	}
	
	public String getTipoDeColaboradores() {
		return UtilJson.getObjectJson(URL_SERVICE + "/rest/colaborador/getTiposDeColaboradores");
	}

	public String getPacientes() {
		return UtilJson.getObjectJson(URL_SERVICE + "/rest/paciente/getPacientes");
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

	public String consultaUsuarioPorLogin(String userName) {
		return UtilJson.getObjectJson(URL_SERVICE + "/rest/usuario/userName/" + userName);
	}

	public String consultaUsuarioPorId(Integer id) {
		return UtilJson.getObjectJson(URL_SERVICE + "/rest/usuario/id/" + id);
	}

	public void setTenant(String tenant) {
		tenant = UtilConverter.objectToJson(tenant);
		
		UtilJson.postJson(URL_SERVICE + "/rest/tenant/setTenant", tenant);
	}

}
