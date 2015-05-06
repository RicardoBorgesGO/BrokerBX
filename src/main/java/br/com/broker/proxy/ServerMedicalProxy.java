package br.com.broker.proxy;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.infra.commons.entity.Colaborador;
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

}
