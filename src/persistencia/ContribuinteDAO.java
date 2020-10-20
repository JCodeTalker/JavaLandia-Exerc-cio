package persistencia;

import java.util.ArrayList;
import contribuintes.Contribuinte;

public class ContribuinteDAO {

	ArrayList<Contribuinte> contribuintes = new ArrayList<Contribuinte>(); // instancia a ArrayList que armazenar� os objs de Contribuintes;
	
	
	// Salva inst�ncias da classe "Contribuinte" no ArrayList:
	public void salvaContribuinte(Contribuinte contrib) {
		contribuintes.add(contrib);
		System.out.printf("Contribuinte %s adicionado!%n", contrib.getNome());
	}
	
	
	// Remove inst�ncias da lista:
	public void removeContribuinte(Contribuinte contrib) {
		contribuintes.remove(contrib);
		System.out.println("O contribuinte " + contrib.getNome() + " foi removido da lista com sucesso!");
	}
	
	
	// Imprime todas as inst�ncias salvas na lista na tela:
	public void buscarTodos() {
		for(Contribuinte a: contribuintes) {
			System.out.println(a.getNome());
		}
	}
}
