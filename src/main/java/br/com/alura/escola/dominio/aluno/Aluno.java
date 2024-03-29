package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;
//AGGREATE ROOT
public class Aluno {

	//object value
	private CPF cpf;
	private String nome;

	//object value
	private Email email;

	//object value
	private List<Telefone> telefones = new ArrayList<>();
	
	private String senha;
	
	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		if (telefones.size() == 2){
			throw new IllegalArgumentException("Numero máximo de telefones já atingido"); //invariantes
		}
		this.telefones.add(new Telefone(ddd, numero));
	}
	
	public String getCpf() {
		return cpf.getNumero();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email.getEndereco();
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public String getSenha() {
		return senha;
	}
	
}






