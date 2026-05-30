package SistemaMedico;

public abstract class Persona {
  private String nombre;
  private String apellido;
  private int DNI;

  public Persona(String nombre, String apellido, int DNI) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.DNI = DNI;
  }

  public abstract void saludar();

  public abstract void despedirse();

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return this.apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getDNI() {
    return this.DNI;
  }

  public void setDNI(int DNI) {
    this.DNI = DNI;
  }

}
