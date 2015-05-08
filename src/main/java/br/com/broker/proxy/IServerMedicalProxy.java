package br.com.broker.proxy;

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
}
