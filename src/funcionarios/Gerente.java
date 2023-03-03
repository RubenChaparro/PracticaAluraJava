package funcionarios;

//Con la palabra extends (hereda de) le decimos que gerente hereda las caracteristicas de la clase padre funcionario 
public class Gerente extends Funcionario implements Autenticable {

private AutenticacionUtil util;
   
    
    public Gerente() {
		this.util = new AutenticacionUtil();
	}
    
    // Sobre escritura de metodo
    public double getBonificacion() {
        System.out.println("Llamando metodo del Gerente");
        return super.getSalario();
    }
    // usamos la palabra super para llamar el atributo de la clase padre ya que es
    // privada

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
}
