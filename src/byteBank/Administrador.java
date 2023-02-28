package byteBank;

// No puede extender de una interfaz ntonces usamos implements para implementar la interfaz
// Podemos heredar los metodos de funcionario y luego implementar a autenticable
public class Administrador extends Funcionario implements Autenticable {
	
	// Al cambiar la clase padre se pierden los mtodos y atributos que se usan de el 
	// No podemos tener herencia multiple en Java 
	// public class Administrador extends Funcionario, FuncionarioAutenticable {
	
	@Override
	public double getBonificacion() {
		return 200;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
	
	

}
