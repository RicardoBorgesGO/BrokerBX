package br.com.broker.core;


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
	
	public String getEndereco(String cep);
}
