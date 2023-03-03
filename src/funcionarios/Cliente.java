package funcionarios;

// No puede extender de una interfaz ntonces usamos implements para implementar la interfaz
public class Cliente implements Autenticable {
	
	// Creamos una nueva clase para referenciar el objeto titular
    private String nombre;
    private String documento;
    private String telefono;
    private AutenticacionUtil util;
   
    
    public Cliente() {
		this.util = new AutenticacionUtil();
	}

	// En el menu de source en generate getter and setter y el IDE nos genera
 	// automaticamente los que seleccionemos
 	
    public String getNombre() {
        return nombre;
    }

    // En el set podemos hacer validaciones de los datos asignados
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

}
