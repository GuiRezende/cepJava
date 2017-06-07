package dao.teste;

import java.util.List;

import dao.PessoaDao;
import modelo.Pessoa;

public class PessoaSelect {

	public static void main(String[] args) {
		
		PessoaDao dao = new PessoaDao();
		List<Pessoa> pessoas = dao.getLista();
		
		for (Pessoa pessoa : pessoas) {
			System.out.println("Cpf: " + pessoa.getCpf());
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Celular: " + pessoa.getCelular());
			System.out.println("Logradouro: " + pessoa.getLogradouro().getNome());
			System.out.println("Numero: " + pessoa.getNumero());
			System.out.println("Complemento: " + pessoa.getComplemento());
			}
	}

}
