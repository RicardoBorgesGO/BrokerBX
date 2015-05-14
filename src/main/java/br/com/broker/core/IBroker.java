package br.com.broker.core;

import br.com.infra.commons.entity.Colaborador;
import br.com.infra.commons.entity.Usuario;


public interface IBroker {
	
	/**
	 * Retorna os colaboradores em JSON
	 * @return
	 */
	public String getMedicalColaboradores();
	
	/**
	 * Retorna os tipos de colaboradores em JSON
	 * @return
	 */
	public String getMedicalTiposDeColaboradores();
	
	/**
	 * Retorna os pacientes em JSON
	 * @return JSON
	 */
	public String getMedicalPacientes();
	
	/**
	 * Salvar colaborador
	 * @param colaborador
	 */
	public void salvarColaborador(Colaborador colaborador);
	
	public String getEndereco(String cep);
	
	public String consultaUsuario(Usuario usuario);
	
	public String consultaUsuarioPorLogin(String userName);
}
