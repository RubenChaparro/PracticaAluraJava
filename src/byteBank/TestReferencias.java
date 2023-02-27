package byteBank;

public class TestReferencias {

	public static void main(String[] args) {
		
		// Elemento mas generico puede ser adaptado
		// al elemento mas especifico
		// El elemento mas generico puede ser adaptado al mas especifico
		// Las referencias de tipos de clases más genéricos referencian objetos más
		// específicos.
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		// Aqui el codigo no compila ya que el objeto funcionario no contiene los
		// metodos de la clase Gerente
		// Aun cuando el objeto sea creado como new Gerente
		// funcionario.iniciarSesion();
		gerente.iniciarSesion("_ddddd");
				
	}
	
}
