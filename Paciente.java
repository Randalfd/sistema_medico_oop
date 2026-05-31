package SistemaMedico;

public class Paciente extends Persona {
	private DetallesTurno detallesTurno;
	private int peso;
	private int altura;
	private String sintomas;
	
	public Paciente(int peso, int altura, String sintomas, String nombre, String apellido, int DNI) {
		this.peso = peso;
		this.altura = altura;
		this.sintomas = sintomas;
		this.detallesTurno = new DetallesTurno();
		super(nombre,apellido,DNI);
	}
	
	// probando etiquetas
	@Override
	public void saludar(){
		System.out.println("hola, soy un paciente");
	}
	
	@Override
	public void despedirse(){
		System.out.println("adios, medico");
	}
	
	public void explicarSintomas(){
		System.out.printf("Mis sintomas son %s %n", this.sintomas);
	}
	
	public int getPeso(){
		return this.peso;
	}
	
	public void setPeso(int peso){
		this.peso = peso;
	}
	
	public int getAltura(){
		return this.altura;
	}
	
	public void setAltura(int altura){
		this.altura = altura;
	}
}
