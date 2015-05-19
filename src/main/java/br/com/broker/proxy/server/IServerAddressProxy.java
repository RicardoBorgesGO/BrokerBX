package br.com.broker.proxy.server;

public interface IServerAddressProxy {

	String SERVER_URL = "http://viacep.com.br/ws/";
	
	public String buscaEndereco(String cep);
}
