package Cuenta;

//Cuando creamos la clase podemos colocarle un extends por defecto en la opcion del menu superclass, luego en browse y buscamos la clase padre
public class CuentaCorriente extends Cuenta implements Tributacion {
	
	// Al extender de la clase padre si o si tenemos que pasar los mismos parametros
	// Entonces creamos el constructor con las reglas del de la clase padre
	// En este caso con los parametros del constructor de la clase cuenta
	// e invocamos con la palabra super el constructor de la clase padre
	public CuentaCorriente( int agencia, int numero) {
		super(agencia, numero);
	}
	
	// siempre debemos verificar que se esta sobreescribiendo el metodo con
	// @override
	// el metodo debe tener el mismo nombre de la clase padre igual que sus
	// argumentos	
	@Override
	// Aca tratamos la excepcion con un throws
	public void saca(double valor) throws SaldoInsuficienteException {
		double comision = 0.2;
		super.saca(valor + comision);
	}
	
	// todos los metodos abstractos de la clase padre deben ir tambien en las class
	// hijas
	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		
	}

	//@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
	
}
