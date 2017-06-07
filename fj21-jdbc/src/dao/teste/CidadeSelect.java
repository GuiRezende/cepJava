package dao.teste;

import java.util.List;

import dao.CidadeDao;
import modelo.Cidade;


public class CidadeSelect {
	
	public static void main(String[] args) {
		
	
		CidadeDao dao = new CidadeDao();
		List<Cidade> cidades = dao.getLista();
		
		for (Cidade cidade: cidades) {
			System.out.println("Nome: " + cidade.getNome());
			System.out.println("Estado: " + cidade.getEstado().getNome());
			}
	}

}


