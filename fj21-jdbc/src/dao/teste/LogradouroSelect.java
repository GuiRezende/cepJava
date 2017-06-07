package dao.teste;

import java.util.List;

import dao.LogradouroDao;
import modelo.Logradouro;

public class LogradouroSelect {

	public static void main(String[] args) {
		
		LogradouroDao dao = new LogradouroDao();
		List<Logradouro> logradouros = dao.getLista();
		
		for (Logradouro logradouro : logradouros) {
			System.out.println("Nome: " + logradouro.getNome());
			System.out.println("Cep: " + logradouro.getCep());
			System.out.println("Logradouro: " + logradouro.getTipologradouro().getNome());
			System.out.println("Bairro: " + logradouro.getBairros().getNome());
			}

	}

}
