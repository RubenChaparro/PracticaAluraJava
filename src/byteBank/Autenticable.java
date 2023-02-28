package byteBank;


public interface Autenticable {
	
	// La interfaz no puede tener metodos privados ya que no seran accecibles al no tener cuerpo

	// La palabra interface vuelve la clase de en interfaz y no peermite tener metodos implementados (con cuerpo)
	// Todos los metodos de una interfaz son abstractos
    public void setClave(String clave);
   
        
    public boolean iniciarSesion(String clave);

    // TODO Al volverse abstracta esta classe no tiene necesidad implementar el metodo de la clase padre
	/*@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}*/
}
