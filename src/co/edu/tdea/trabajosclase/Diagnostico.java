package co.edu.tdea.principal.animal;

import java.time.LocalDate;

public class Diagnostico {
	
	private LocalDate fecha;
	private String descripcion;
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
