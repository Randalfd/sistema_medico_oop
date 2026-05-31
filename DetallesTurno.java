package SistemaMedico;

import java.util.*;

public class DetallesTurno {

    private String diagnostico;
    private List<String> medicamentos;

    public DetallesTurno() {
        this.medicamentos = new ArrayList<>();
    }

    public DetallesTurno(List<String> medicamentos) {
        this.medicamentos = new ArrayList<>(medicamentos);
    }

    public String getDiagnostico() {
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public List<String> getMedicamentos() {
        return new ArrayList<>(this.medicamentos);
    }

    public void addMedicamento(String medicamento) {
        this.medicamentos.add(medicamento);
    }

    public void setMedicamentos(List<String> medicamentos) {
        this.medicamentos = new ArrayList<>(medicamentos);
    }

    public void removeMedicamentoByIndex(int index) {
        this.medicamentos.remove(index);
    }

    // simulando prueba unitaria con un main
    public static void main(String[] args) {
        var turn_details = new DetallesTurno();

        turn_details.addMedicamento("test");
        turn_details.addMedicamento("test1");
        turn_details.addMedicamento("test2");
        turn_details.removeMedicamentoByIndex(1);

        System.out.println(turn_details.getMedicamentos());

        // recorrido con un foreach
        for (String e : turn_details.getMedicamentos()) {
            System.out.println(e);
        }
    }
}
