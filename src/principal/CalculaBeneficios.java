package principal;

import contribuintes.Contribuinte;
import persistencia.ContribuinteDAO;
import java.time.LocalDate;


public class CalculaBeneficios {

	public static void main(String[] args) {
		
		// Instâncias de Contribuintes:
		Contribuinte joao = new Contribuinte("João da Silva", "001-x", LocalDate.of(2012,04,25), true, 0.11, 5500);
		
		Contribuinte mariaCunha =new Contribuinte("Maria Cunha", "002-9", LocalDate.of(2011, 06, 30), true, 0.1, 3000);
		 
		Contribuinte manoelJose = new Contribuinte("Manoel José", "003-4", LocalDate.of(1978, 06, 30);, false, 0.08, 1500);
		
		Contribuinte fernando = new Contribuinte("Fernando AlgumaCoisa", "123-4", LocalDate.of(1995, 9, 22), false, 0.2, 9800);
		
		Contribuinte fulano = new Contribuinte("Fulano de Tal", "567-8", LocalDate.of(2000, 02, 13), true, 0.15, 7000);
		
		// Instância da classe de persistência:
		ContribuinteDAO dao = new ContribuinteDAO();
		
		
		dao.salvaContribuinte(joao);
		dao.salvaContribuinte(mariaCunha);
		dao.salvaContribuinte(manoelJose);
		dao.salvaContribuinte(fernando);
		dao.removeContribuinte(mariaCunha);
		
		
		dao.buscarTodos();
		
		
		System.out.println(joao.imprimirContribuicaoMensal());
		System.out.println(mariaCunha.imprimirContribuicaoMensal());
		System.out.println(manoelJose.imprimirContribuicaoMensal());
		
		
	}
}
