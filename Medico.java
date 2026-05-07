package SistemaMedico;

import java.util.*;

public class Medico extends Persona {
	private Especialidad especialidad;
	private double salario;
	private Date ingreso;
	
	public Medico( Especialidad especialidad, double salario, Date ingreso, String nombre, String apellido, int DNI) {
		this.especialidad = especialidad;
		this.salario = salario;
		this.ingreso = ingreso;
		super(nombre,apellido,DNI);
	}
	
	// Sin probar la funcionalidad, concretametne
	public void atenderPaciente(Paciente paciente, Turno turno) {
		System.out.printf("Atendiendo al paciente: %s %s en el turno %tF %n", paciente.getNombre(), paciente.getApellido(), turno.getIngreso());
	}
	
	// probando etiquetas
	@Override
	public void saludar(){
		System.out.println("hola, soy un medico");
	}
	
	@Override
	public void despedirse(){
		System.out.println("adios, paciente");
	}
	
	public Especialidad getEspecialidad(){
		return this.especialidad;
	}	
	
	public void setEspecialidad(Especialidad especialidad){
		this.especialidad = especialidad;
	}	
	
	public double getSalario(){
		return this.salario;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
		
	public Date getIngreso(){
		return this.ingreso;
	}
	
	public void setIngeso(Date ingreso){
		this.ingreso = ingreso;
	}
	
	
}
