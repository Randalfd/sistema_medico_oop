package SistemaMedico;

import java.util.*;

public class Turno {
	private Paciente paciente;
	private Medico medico;
	private DetallesTurno detallesTurno;
	private Date ingreso;
	private Date salida = null;
	private boolean terminado = false;
	private double precio;	 
	
	public Turno(Paciente paciente, Medico medico) {
		this.paciente = paciente;
		this.medico = medico;
		this.ingreso = ingreso;
		this.precio = precio;
		this.detallesTurno = new DetallesTurno();
	}
	
	// este metodo tiene funcionalidad desde antes del aviso que solo presentara un mensaje.
	public void terminarTurno(double pago) {
		if(this.terminado) { 
			System.out.println("El turno ya esta termiado");
		} else if(paciente.pagarTurno(this, pago)){ 
			this.salida = new Date();
			this.terminado = true;
		}
		
	}
	
	public void estadoTurno(){
		System.out.println("El estado del turno es...");
	}
	
	public Paciente getPaciente(){
		return this.paciente;
	}
	
	public void setPaciente(Paciente paciente){
		this.paciente = paciente;
	}
	
	public Medico getMedico(){
		return this.medico;
	}
	
	public void setMedico(Medico medico){
		this.medico = medico;
	}
	
	public Date getIngreso(){
		return this.ingreso;
	}
	
	public void setIngeso(Date ingreso){
		this.ingreso = ingreso;
	}
	
	public Date getSalida(){
		return this.salida;
	}
	
	public void setSalida(Date salida){
		this.salida = salida;
	}
	
	public boolean isTerminado(){
		return this.terminado;
	}
	
	public void setTerminado(boolean terminado){
		this.terminado = terminado;
	}
	
	public double getPrecio(){
		return this.precio;
	}
	
	public void setPrecio(double precio){
		this.precio = precio;
	}
}
