package Cuenta;

import funcionarios.Cliente;

public abstract class Cuenta {

	//La clase no puede ser instanciada tiene que ser por medio de las clases hijas
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;

    public Cuenta() {

    }

    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }
    // Al definir metodos abstractos la clase tambien debe ser abstracta
    public abstract void deposita(double valor);

    // Creamos una excepcion de saldo insuficiente
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo <= valor) {
        	throw new SaldoInsuficienteException("No tienes saldo");
        	
        }
            this.saldo -= valor;
        
    }
    
    // Le informamos a Java que aqui va a haber una excepcion y le decimos que la trate al cambiar de unchecked a checked
    public boolean transfiere(double valor, Cuenta destino) throws SaldoInsuficienteException {
        if(this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

}
