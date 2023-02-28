package byteBank;

//Con la palabra extends (hereda de) le decimos que gerente hereda las caracteristicas de la clase padre funcionario 
public class Gerente extends Funcionario implements Autenticable {

    // Sobre escritura de metodo
    public double getBonificacion() {
        System.out.println("Llamando metodo del Gerente");
        return super.getSalario();
    }
    // usamos la palabra super para llamar el atributo de la clase padre ya que es
    // privada

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
