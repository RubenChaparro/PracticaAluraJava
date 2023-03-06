package Cuenta;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123000,456000);
		cuenta.deposita(200000);
		try {
			cuenta.saca(200000);
			cuenta.saca(100000);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
	}

}
