package SistemaMedico;

import java.util.*;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;

public class Turno implements IAtencionMedica {
  private Paciente paciente;
  private Medico medico;
  private DetallesTurno detallesTurno;
  private LocalDateTime ingreso;
  private LocalDateTime salida = null;
  private boolean terminado = false;
  private double precio;

  public Turno(Paciente paciente, Medico medico, double precio) {
    this.paciente = paciente;
    this.medico = medico;
    this.ingreso = LocalDateTime.now();
    this.precio = precio;
    this.detallesTurno = new DetallesTurno();
  }

	public boolean pagarTurno(double pago) {
		System.out.println("pagando turno");
		if(this.precio <= pago) {
			System.out.println("Turno pagado");
			return true;
		} else {
			System.out.println("Pago insuficiente");
			return false;
		}
	}

  public void terminarTurno(double pago) {
    if (this.terminado) {
      System.out.println("El turno ya esta termiado");
    } else if (this.pagarTurno(pago)) {
      this.salida = LocalDateTime.now();
      this.terminado = true;
    }

  }

  public void estadoTurno() {
    System.out.println("El estado del turno es...");
  }

  @Override
  public Paciente getPaciente() {
    return this.paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  @Override
  public LocalDateTime getDateTime() {
    return this.ingreso;
  }

  @Override
  public Medico getMedico() {
    return this.medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  @Override
  public Especialidad getEspecialidad() {
    return this.medico.getEspecialidad();
  }

  @Override
  public void cancel() {
    System.out.println("Cancelando Turno");
  }

  @Override
  public void changeDateTime(LocalDateTime newDateTime) {
    System.out.println("reprogramando turno a" + newDateTime.toString());
  }

  public void setIngreso(LocalDateTime ingreso) {
    this.ingreso = ingreso;
  }

  public LocalDateTime getSalida() {
    return this.salida;
  }

  public void setSalida(LocalDateTime salida) {
    this.salida = salida;
  }

  public boolean isTerminado() {
    return this.terminado;
  }

  public void setTerminado(boolean terminado) {
    this.terminado = terminado;
  }

  public double getPrecio() {
    return this.precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }
}
