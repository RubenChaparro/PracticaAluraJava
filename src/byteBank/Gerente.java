package byteBank;

//Con la palabra extends (hereda de) le decimos que gerente hereda las caracteristicas de la clase padre funcionario 
public class Gerente extends Funcionario {

    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    // Sobre escritura de metodo
    public double getBonificacion() {
        System.out.println("Llamando metodo del Gerente");
        return super.getSalario();
    }
    // usamos la palabra super para llamar el atributo de la clase padre ya que es
    // privada
    
    public boolean iniciarSesion(String clave) {
        if(this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }

}
