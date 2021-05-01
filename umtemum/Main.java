package com.alisson.cadastrodeclientes.umtemum;

public class Main {

	public static void main(String[] args) {

		Contato novoContato = new Contato();
		novoContato.setNome("Vento Divino");

		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua do bobos");
		endereco.setComplemento("-");
		endereco.setNumero("0");
		endereco.setCidade("Cidade Invisível");
		endereco.setEstado("Distrito Federal");
		endereco.setCep("99999-000");

		novoContato.setEndereco(endereco);

		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("99");
		telefone.setNumero("99999-9999");

		novoContato.setTelefone(telefone);
		
		System.out.println(novoContato.getEndereco().getNomeRua());
		System.out.println(novoContato.getTelefone().getDdd() + " " + novoContato.getTelefone().getNumero());
	}

}
