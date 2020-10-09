package principal;

import contribuintes.Contribuinte;

import java.time.LocalDate;

public class CalculaBeneficios {
	
	

	public static void main(String[] args) {
		
		LocalDate joaoAnivers = LocalDate.of(2012,04,25);
		Contribuinte joao = new Contribuinte("João da Silva", "001-x", joaoAnivers, true, 0.11, 5500);
		
		LocalDate mariaAdmis = LocalDate.of(2011, 06, 30);
		Contribuinte mariaCunha =new Contribuinte("Maria Cunha", "002-9", mariaAdmis, true, 0.1, 3000);
		
		LocalDate joseAdmis = LocalDate.of(1978, 06, 30);
		Contribuinte manoelJose = new Contribuinte("Manoel José", "003-4", joseAdmis, false, 0.08, 1500);
		
		System.out.println(joao.imprimirContribuicaoMensal());
		System.out.println(mariaCunha.imprimirContribuicaoMensal());
		System.out.println(manoelJose.imprimirContribuicaoMensal());
		
		
	}
}
