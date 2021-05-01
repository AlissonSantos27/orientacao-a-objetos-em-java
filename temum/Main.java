package com.alisson.cadastrodeclientes.temum;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Alisson");
		//cliente.setEndereco("Rua dos tolos");
		cliente.setTelefone("99 99999-9999");
		
		//criar endereco
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua dos tolos");
		endereco.setNumero("0");
		endereco.setComplemento("É uma casa muito engraçada");
		endereco.setCidade("Cantigas infantis");
		endereco.setEstado("Folclore nacional");
		endereco.setCep("99999-000");
		
		cliente.setEndereco(endereco);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getEndereco().getCidade());
		System.out.println(cliente.getTelefone());
		

	}

}
