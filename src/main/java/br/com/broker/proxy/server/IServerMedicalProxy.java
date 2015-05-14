package br.com.broker.proxy.server;

import br.com.infra.commons.entity.Colaborador;
import br.com.infra.commons.entity.Usuario;

public interface IServerMedicalProxy {

	/**
	 * URL do servico Medical
	 */
	String URL_SERVICE = "http://localhost:8080/spring-jpa";
	
	/**
	 * Retorna todos os colaboradores
	 * @return JSON
	 */
	public String getColaboradores();
	
	/**
	 * Retorna os tipos de colaboradores em JSON
	 * @return JSON
	 */
	public String getTipoDeColaboradores();
	
	/**
	 * Retorna os pacientes em JSON
	 * @return JSON
	 */
	public String getPacientes();
	
	/**
	 * Salva colaborador
	 * @param colaborador
	 */
	public void salvarColaborador(Colaborador colaborador);
	
	/**
	 * Consulta usuario
	 * @param usuario
	 */
	public String consultaUsuario(Usuario usuario);
	
	/**
	 * Consulta usuario por login
	 * @return
	 */
	public String consultaUsuarioPorLogin(String userName);
	
}
