package dao.teste;

import java.util.List;

import dao.BairroDao;
import dao.modelo.Bairro;

public class BairroSelect {

	public static void main(String[] args) { 
	
		BairroDao dao = new BairroDao();
		List<Bairro> bairros = dao.getLista();
		
		for (Bairro bairro: bairros) {
			System.out.println("Nome: " + bairro.getNome());
			System.out.println("Estado: " + bairro.getCidade().getNome());
			}
	}

}


