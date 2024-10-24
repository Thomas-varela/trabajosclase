package co.edu.tdea.principal.personal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import co.edu.tdea.principal.animal.Diagnostico;

public class Personal {
	
	private String nombres;
	private String apellidos;
	private LocalDate fechaContratacion;
	
	private List<Diagnostico> diagnosticos = new ArrayList<>();
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFechaContratacion() {
		return fechaContratacion;
	}
	public void setFechaContratacion(LocalDate fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}
	
}
