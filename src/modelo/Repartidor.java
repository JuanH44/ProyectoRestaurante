/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan M. Hdez
 */
public class Repartidor extends Persona {
  private int id;
  private String Transporte;
  private int tiempo; //minutos
  private double calificacion;

  public Repartidor(String nombre, String apellido, String telefono, String direccion) {
    super(nombre, apellido, telefono, direccion);
  }
  
  @Override
  public void hola() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
