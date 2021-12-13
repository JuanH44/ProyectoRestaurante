package modelo;


public class Cliente extends Persona{
  private int metodoPago; //Categoria
  
  
  
  public Cliente(String nombre, String apellido, String telefono, String direccion) {
    super(nombre, apellido, telefono, direccion);
  }

  @Override
  public void hola() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
