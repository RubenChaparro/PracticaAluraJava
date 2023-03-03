package funcionarios;

public class AutenticacionUtil {
	 private String clave;
	 
	// Ya que el metodo retorna un boleano podemos decirle que retorne si clave es igual al argumento clave
		public boolean iniciarSesion(String clave) {
			return this.clave == clave;
		}

		public void setClave(String clave) {
			this.clave = clave;
			
		}
}
