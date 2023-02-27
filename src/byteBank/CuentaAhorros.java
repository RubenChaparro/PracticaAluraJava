package byteBank;

public class CuentaAhorros extends Cuenta {

	// Con la autocoreccion de eclipse podemos crear el constructor
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

}
