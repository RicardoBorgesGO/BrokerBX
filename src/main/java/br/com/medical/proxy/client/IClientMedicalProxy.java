package br.com.medical.proxy.client;

import java.util.List;

import br.com.infra.commons.entity.Colaborador;
import br.com.infra.commons.entity.Paciente;
import br.com.infra.commons.entity.TipoDeColaborador;
import br.com.infra.commons.entity.Usuario;

public interface IClientMedicalProxy {

	public List<Colaborador> getColaboradores();
	
	public void salvarColaborador(Colaborador colaborador);
	
	public List<TipoDeColaborador> getTiposDeColaboradores();
	
	public List<Paciente> getPacientes();
	
	public boolean consultaUsuario(Usuario usuario);
	
	public Usuario consultaUsuarioPorLogin(String userName);
}
