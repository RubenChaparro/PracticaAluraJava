package funcionarios;

public class ControlBonificacion {

	private double suma;
	
	// Mediante el poliformismo podemos darle al metodo argumento del tipo
	// funcionario
	// El argumento sirve para todos las otras clases hijas ya que todas extienden
	// de tipo funcionario
	// Toda clase hijo debe implementar los metodos abstractos de la clase padre
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
	
	
}
