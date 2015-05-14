package br.com.medical.proxy.client;

import java.util.List;

import br.com.infra.commons.entity.Colaborador;
import br.com.infra.commons.entity.Paciente;
import br.com.infra.commons.entity.TipoDeColaborador;
import br.com.infra.commons.entity.Usuario;

public interface IClientMedicalProxy {

	/**
	 * Busca Colaboradores
	 * @return
	 */
	List<Colaborador> getColaboradores();
	
	/**
	 * Persiste colaborador
	 * @param colaborador
	 */
	void salvarColaborador(Colaborador colaborador);
	
	/**
	 * Busca tipos de colaboradores
	 * @return
	 */
	List<TipoDeColaborador> getTiposDeColaboradores();
	
	/**
	 * Busca pacientes
	 * @return
	 */
	List<Paciente> getPacientes();
	
	/**
	 * verifica se usuario existe
	 * @param usuario
	 * @return
	 */
	boolean consultaUsuario(Usuario usuario);
	
	/**
	 * Consulta usuario pelo login
	 * @param userName
	 * @return
	 */
	Usuario consultaUsuarioPorLogin(String userName);
	
	/**
	 * Consulta usuario pelo id
	 * @param id
	 * @return
	 */
	Usuario consultaUsuarioPorId(Integer id);
}
