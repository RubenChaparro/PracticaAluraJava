package byteBank;

//Con la palabra reservada abstract le decimos a Java que la clase es una reporesentacion y no una clase fisica
public abstract class Funcionario {

    private String nombre;
    private String documento;
    private double salario;
    private int tipo;

    public Funcionario() {

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Podemos crear un metodo abstracto para que sea implemntado por las clases
 	// hijas
 	// este metodo no debe tener cuerpo ya que no compilara
    public abstract double getBonificacion();

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }



}
