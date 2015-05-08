package br.com.medical.proxy.client;

import java.util.List;

import br.com.infra.commons.entity.Colaborador;
import br.com.infra.commons.entity.Paciente;
import br.com.infra.commons.entity.TipoDeColaborador;

public interface IClientMedicalProxy {

	public List<Colaborador> getColaboradores();
	
	public List<TipoDeColaborador> getTiposDeColaboradores();
	
	public List<Paciente> getPacientes();
}
