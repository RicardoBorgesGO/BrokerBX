package br.com.broker.proxy;

public interface IServerMedicalProxy {

	String URL_SERVICE = "http://localhost:8080/spring-jpa";
	
	public String getColaboradores();
}
