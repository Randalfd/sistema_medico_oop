package SistemaMedico;

import java.time.LocalDateTime;

public interface IAtencionMedica {
  LocalDateTime getDateTime();

  Medico getMedico();

  Paciente getPaciente();

  Especialidad getEspecialidad();

  void cancel();

  void changeDateTime(LocalDateTime newDateTime);
}
