package funcionarios;

public class TestFuncionario {

	public static void main(String[] args) {
		
		// Como la clase Funcionario es abstracta no podemos instanciarla
		// Podemos instanciar una clase hijo ya que extiende de Funcionario y es una
		// clase normal
		Funcionario diego = new Contador();
		diego.setDocumento("Diego");
		diego.setDocumento("444556665");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
