package funcionarios;

public class SistemaInterno {
	
	private String clave = "12345"; 
	// La interfaz puede usarse como parametro
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		} else {
			System.out.println("Error de login");
			return false;
		}
				
	}

}
