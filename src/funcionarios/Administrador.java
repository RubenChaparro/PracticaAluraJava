package funcionarios;

// No puede extender de una interfaz ntonces usamos implements para implementar la interfaz
// Podemos heredar los metodos de funcionario y luego implementar a autenticable
public class Administrador extends Funcionario implements Autenticable {
	
	// Al cambiar la clase padre se pierden los mtodos y atributos que se usan de el 
	// No podemos tener herencia multiple en Java 
	// public class Administrador extends Funcionario, FuncionarioAutenticable {
	
private AutenticacionUtil util;
   
    
    public Administrador() {
		this.util = new AutenticacionUtil();
	}
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
}
