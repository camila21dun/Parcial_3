package model;

import java.util.ArrayList;
import java.util.List;


public class Estudiante {

	private String nombre;
	private String Identificacion;
	private TipoGenero genero;
	private ArrayList<Float> notas;


	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String identificacion, TipoGenero genero, ArrayList<Float> notas) {
		super();
		this.nombre = nombre;
		Identificacion = identificacion;
		this.genero = genero;
		this.notas= notas;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIdentificacion() {
		return Identificacion;
	}

	public void setIdentificacion(String identificacion) {
		Identificacion = identificacion;
	}


	public TipoGenero getGenero() {
		return genero;
	}

	public void setGenero(TipoGenero genero) {
		this.genero = genero;
	}

	 public ArrayList<Float> getNotas() {
		return notas;
	}


	public void setNotas(ArrayList<Float> notas) {
		this.notas = notas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Identificacion == null) ? 0 : Identificacion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (Identificacion == null) {
			if (other.Identificacion != null)
				return false;
		} else if (!Identificacion.equals(other.Identificacion))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", Identificacion=" + Identificacion + ", genero=" + genero + ", notas="
				+ notas + "]";
	}

/**
 * metodo que calcula el promedio
 * @return
 */
	 public float calcularPromedio() {
	        float suma = 0;
	        for (float nota : notas) {
	            suma += nota;
	        }
	        return suma / notas.size();
	    }

}
