package Cuenta;

public class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException(String mensaje) {
		super (mensaje);		
	}
}
