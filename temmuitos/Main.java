package com.alisson.cadastrodeclientes.temmuitos;

public class Main {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Alisson");
		
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua dos bobos");
		endereco.setNumero("0");
		endereco.setComplemento("-");
		endereco.setCidade("Cidade Inventada");
		endereco.setEstado("Estado de calamidade");
		endereco.setCep("00000-000");
		
		contato.setEndereco(endereco);
		
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("99");
		telefone.setNumero("999999999");
		
		Telefone telefone1 = new Telefone();
		telefone.setTipo("residencial");
		telefone.setDdd("99");
		telefone.setNumero("9999999999999999");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone1;
		
		contato.setTelefones(telefones);
		
	}

}
