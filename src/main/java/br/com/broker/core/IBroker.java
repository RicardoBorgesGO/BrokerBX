package br.com.broker.core;

import br.com.infra.commons.entity.Colaborador;
import br.com.infra.commons.entity.Usuario;

/**
 * Classe corretora, que conhece todos os servidores de servicos disponiveis
 * para atender um cliente
 * @author Ricardo
 *
 */
public interface IBroker {
	
	/**
	 * Retorna os colaboradores em JSON
	 * @return
	 */
	String getMedicalColaboradores();
	
	/**
	 * Retorna os tipos de colaboradores em JSON
	 * @return
	 */
	String getMedicalTiposDeColaboradores();
	
	/**
	 * Retorna os pacientes em JSON
	 * @return JSON
	 */
	String getMedicalPacientes();
	
	/**
	 * Salvar colaborador
	 * @param colaborador
	 */
	void salvarColaborador(Colaborador colaborador);
	
	/**
	 * Consulta endereco pelo CEP
	 * @param cep
	 * @return
	 */
	String getEndereco(String cep);
	
	/**
	 * Consulta usuario
	 * @param usuario
	 * @return
	 */
	String consultaUsuario(Usuario usuario);
	
	/**
	 * Consulta usuario pelo login
	 * @param userName
	 * @return
	 */
	String consultaUsuarioPorLogin(String userName);
	
	/**
	 * Consulta usuario por id
	 * @param id
	 * @return
	 */
	String consultaUsuarioPorId(Integer id);
	
	/**
	 * Altera o tenant atual
	 * @param tenant
	 */
	void setTenant(String tenant);
}
